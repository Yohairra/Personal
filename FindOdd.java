public class FindOdd {
	public static int findIt(int[] a) {
    for (int i = 0; i < a.length; i++) {
        int count = 0;
        
        for (int j = 0; j < a.length; j++) {
            if (a[i] == a[j]) {
            count++;
            }
        }
      
        if ((count & 1) != 0) {
            return a[i];
        }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] a = new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
    int[] b = new int[]{1,1,2,-2,5,2,4,4,-1,-2,5};
    int[] c = new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5};
    int[] d = new int[]{10};
    int[] e = new int[]{1,1,1,1,1,1,10,1,1,1,1};
    int[] f = new int[]{5,4,3,2,1,5,4,3,2,10,10};

    int resultA = findIt(a);
    int resultB = findIt(b);
    int resultC = findIt(c);
    int resultD = findIt(d);
    int resultE = findIt(e);
    int resultF = findIt(f);

    System.out.println(resultA);
    System.out.println(resultB);
    System.out.println(resultC);
    System.out.println(resultD);
    System.out.println(resultE);
    System.out.println(resultF);
  }
}