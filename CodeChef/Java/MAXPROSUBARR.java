 public static int maxProductSubarray(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int maxProd = arr[0];
        int currMax = arr[0];
        int currMin = arr[0];

        for (int i = 1; i < n; i++) {
            int num = arr[i];

            // Swap if negative
            if (num < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(num, currMax * num);
            currMin = Math.min(num, currMin * num);

            maxProd = Math.max(maxProd, currMax);
        }

        return maxProd;
    }