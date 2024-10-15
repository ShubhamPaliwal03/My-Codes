def knapsack(weights, values, W):
    n = len(weights)
    # Create a 2D DP array with (n+1) x (W+1)
    dp = [[0 for _ in range(W + 1)] for _ in range(n + 1)]

    # Build the DP table
    for i in range(1, n + 1):
        for w in range(W + 1):
            if weights[i - 1] <= w:
                # Item can be included in the knapsack
                dp[i][w] = max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1])
            else:
                # Item cannot be included in the knapsack
                dp[i][w] = dp[i - 1][w]

    return dp[n][W]

# Example usage:
weights = [1, 2, 3, 8, 7, 4]   # Weights of the items
values = [20, 5, 10, 40, 15, 25] # Values of the items
W = 10  # Capacity of the knapsack

print("Maximum value that can be obtained is:", knapsack(weights, values, W))