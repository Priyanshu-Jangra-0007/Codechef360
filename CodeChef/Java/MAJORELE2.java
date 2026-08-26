public static List<Long> findSuperstarDishes(List<Long> a, int n) {
    long el1 = Long.MIN_VALUE, el2 = Long.MIN_VALUE;
    int cnt1 = 0, cnt2 = 0;

    // Phase 1: Voting
    for (int i = 0; i < n; i++) {
        long val = a.get(i);

        if (val == el1) cnt1++;
        else if (val == el2) cnt2++;
        else if (cnt1 == 0) {
            el1 = val;
            cnt1 = 1;
        }
        else if (cnt2 == 0) {
            el2 = val;
            cnt2 = 1;
        }
        else {
            cnt1--;
            cnt2--;
        }
    }

    // Phase 2: Validation
    cnt1 = 0;
    cnt2 = 0;

    for (int i = 0; i < n; i++) {
        long val = a.get(i);
        if (val == el1) cnt1++;