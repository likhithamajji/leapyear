class leapyear{
    public static void main(String[] args) {
        int n=4565;
        checkleapyear(n);
    }
    public static void checkleapyear(int n){
        if(n%4==0&&n%100!=0||n%400==0){
            System.out.println("leapyear");
        }
    }
}