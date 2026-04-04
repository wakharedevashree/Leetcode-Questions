class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode* curr = head;
        int count = 0;

        // Step 1: Check if k nodes exist
        while (curr != NULL && count < k) {
            curr = curr->next;
            count++;
        }

        // Step 2: If k nodes exist, reverse
        if (count == k) {
            curr = reverseKGroup(curr, k); // recursive call

            // Step 3: Reverse k nodes
            while (count--) {
                ListNode* temp = head->next;
                head->next = curr;
                curr = head;
                head = temp;
            }
            head = curr;
        }

        return head;
    }
};