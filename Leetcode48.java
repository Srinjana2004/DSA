for (int i = 0; i < n; i++)
 for (int j = i; j < n; j++)
 swap(matrix, i, j, j, i);
for (int i = 0; i < n; i++)
 for (int j = 0, k = n - 1; j < k; j++, k--)
 swap(matrix, i, j, i, k);