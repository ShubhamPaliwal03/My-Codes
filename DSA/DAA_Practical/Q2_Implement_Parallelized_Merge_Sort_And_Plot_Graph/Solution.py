import random
import time
import matplotlib.pyplot as plt
from multiprocessing import Pool

# Merge Sort implementation
def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])

    return merge(left, right)

def merge(left, right):
    result = []
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    result.extend(left[i:])
    result.extend(right[j:])
    return result

# Function to merge pairs of sorted arrays
def merge_pairs(pair):
    return merge(pair[0], pair[1])

# Parallelized Merge Sort
def parallel_merge_sort(arr):
    num_processes = 4  # Adjust based on your system's CPU cores
    pool = Pool(processes=num_processes)
    size = len(arr) // num_processes
    chunks = [arr[i*size:(i+1)*size] for i in range(num_processes)]

    sorted_chunks = pool.map(merge_sort, chunks)
    while len(sorted_chunks) > 1:
        extra = sorted_chunks.pop() if len(sorted_chunks) % 2 == 1 else None
        pairs = [(sorted_chunks[i], sorted_chunks[i+1]) for i in range(0, len(sorted_chunks), 2)]
        sorted_chunks = pool.map(merge_pairs, pairs) + ([extra] if extra else [])
    pool.close()
    pool.join()
    return sorted_chunks[0]

# Function to measure time taken to sort elements using Parallelized Merge Sort
def measure_time(n):
    arr = [random.randint(1, 10000) for _ in range(n)]
    start_time = time.time()
    sorted_arr = parallel_merge_sort(arr)
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
    plt.title('Parallelized Merge Sort: Time Taken vs Number of Elements')
    plt.xlabel('Number of Elements (n)')
    plt.ylabel('Time Taken (seconds)')
    plt.grid(True)
    plt.show()

if __name__ == "__main__":
    main()
