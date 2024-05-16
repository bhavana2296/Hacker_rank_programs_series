class HelloWorld {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1; j++){
                System.out.print(" ");
            }
            for(int r=n-1-i;r<n; r++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
