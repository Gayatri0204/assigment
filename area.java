class area {
    area(int r) {
        double ans;
        ans = 3.14 * r * r;
        System.out.println("area of circle =" + ans);

    }

    area(int l, int b) {
        int ans;
        ans = l * b;
        System.out.println("area of rectangle =" + ans);

    }

    public static void main(String arg[]) {
        area a = new area(90);
        area a1 = new area(20, 14);
    }
}
