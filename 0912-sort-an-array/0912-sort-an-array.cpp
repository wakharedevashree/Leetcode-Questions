class Solution {
public:

    void merge(vector<int>& arr, int start, int end, int mid)
    {
        int size = end - start + 1;
        vector<int> temp(size);

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end)
        {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= end)
            temp[k++] = arr[j++];

        for (int m = 0; m < size; m++)
            arr[start + m] = temp[m];
    }

    void mergesort(vector<int>& arr, int start, int end)
    {
        if (start >= end)
            return;

        int mid = (start + end) / 2;

        mergesort(arr, start, mid);
        mergesort(arr, mid + 1, end);
        merge(arr, start, end, mid);
    }

    vector<int> sortArray(vector<int>& nums)
    {
        mergesort(nums, 0, nums.size() - 1);
        return nums;
    }
};
