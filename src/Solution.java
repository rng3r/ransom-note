
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] magazineWeights = new int[Letter.values().length];
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            int weightIdx = Letter.valueOf(Character.toString(c)).idx;
            magazineWeights[weightIdx]++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            int weightIdx = Letter.valueOf(Character.toString(c)).idx;
            int currentValue = magazineWeights[weightIdx];
            if (currentValue == 0)
                return false;
            magazineWeights[weightIdx]--;
        }

        return true;
    }


    enum Letter {
        a(0),
        b(1),
        c(2),
        d(3),
        e(4),
        f(5),
        g(6),
        h(7),
        i(8),
        j(9),
        k(10),
        l(11),
        m(12),
        n(13),
        o(14),
        p(15),
        q(16),
        r(17),
        s(18),
        t(19),
        u(20),
        v(21),
        w(22),
        x(23),
        y(24),
        z(25);

        private final int idx;

        Letter(int idx) {
            this.idx = idx;
        }
    }

}