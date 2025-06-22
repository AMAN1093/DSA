import yfinance as yf
import pandas_ta as ta
import pandas as pd
import matplotlib.pyplot as plt

# Step 1: Load historical data
symbol = 'BTC-USD'
df = yf.download(symbol, interval='15m', period='7d')

# Step 2: Add indicators
df['EMA20'] = ta.ema(df['Close'], length=20)
df['EMA50'] = ta.ema(df['Close'], length=50)
df['RSI'] = ta.rsi(df['Close'], length=14)

# Step 3: Buy/Sell logic
df['Signal'] = ''
df.loc[
    (df['EMA20'] > df['EMA50']) &
    (df['Close'] > df['EMA20']) &
    (df['RSI'] > 45) & (df['RSI'].shift(1) < 45),
    'Signal'
] = 'Buy'

df.loc[
    (df['EMA20'] < df['EMA50']) &
    (df['Close'] < df['EMA20']) &
    (df['RSI'] < 55) & (df['RSI'].shift(1) > 55),
    'Signal'
] = 'Sell'

# Step 4: View signals
print(df[['Close', 'EMA20', 'EMA50', 'RSI', 'Signal']].tail(50))

# Optional: Plot chart
plt.figure(figsize=(12,6))
plt.plot(df['Close'], label='Price')
plt.plot(df['EMA20'], label='EMA 20')
plt.plot(df['EMA50'], label='EMA 50')
plt.legend()
plt.title(f"{symbol} with Buy/Sell Signals")
plt.show()