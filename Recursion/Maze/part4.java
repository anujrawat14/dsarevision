//stoping recursion at obstacles (1,1)

static List<String> pathOb(String p, int r, int c) {
        //obsatcle
        if (r == 1 && c == 1) {
            return new ArrayList<>();
        }

  //base condition
        if (r == 2 && c == 2) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        List<String> ans = new ArrayList<>();
        if (r < 2) {
            ans.addAll(pathOb(p + "D", r + 1, c));
        }
        if (c < 2) {
            ans.addAll(pathOb(p + "R", r, c + 1));
        }
        return ans;
    }
