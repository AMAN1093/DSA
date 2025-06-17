def linear_search(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i 
    return -1  


arr = list(map(int, input("Enter the elements of the array (space-separated): ").split()))

target = int(input("Enter the target element to search: "))


result = linear_search(arr, target)


if result != -1:
    print("Element found at index:", result)
else:
    print("Element not found in the array.")
