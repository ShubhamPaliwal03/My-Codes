import random
import time
import matplotlib.pyplot as plt

# Quicksort implementation
def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quicksort(left) + middle + quicksort(right)

# Function to measure time taken to sort elements using Quicksort
def measure_time(n):
    arr = [random.randint(1, 10000) for _ in range(n)]
    start_time = time.time()
    sorted_arr = quicksort(arr)
    end_time = time.time()
    return end_time - start_time

# Main function to generate data and plot the graph
def main():
    ns = [100, 500, 1000, 5000, 10000, 20000, 30000, 40000, 50000]
    times = []

    for n in ns:
        t = measure_time(n)
        times.append(t)
        print(f"Time taken to sort {n} elements: {t:.6f} seconds")

    # Plotting the graph
    plt.figure(figsize=(10, 5))
    plt.plot(ns, times, marker='o')
    plt.title('Quicksort: Time Taken vs Number of Elements')
    plt.xlabel('Number of Elements (n)')
    plt.ylabel('Time Taken (seconds)')
    plt.grid(True)
    plt.show()

if __name__ == "__main__":
    main()