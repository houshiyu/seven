package stringtest;

public class Recycle {
    public static boolean isRecycle(String str){

        int len = str.length();
        Character[] chars = new Character[len];

        for(int i =0;i<len;i++){
            chars[len-i-1] = str.charAt(i);
        }

        for(int i = 0;i<len;i++){
            char sourceChar = str.charAt(i);
            char targetChar = chars[i];
            System.out.println(sourceChar+"   "+targetChar);
            if(sourceChar!=targetChar){
                return false;
            }
        }
        return true;
    }

    public static boolean isRecycleV2(String str){

        if(str == null || str.length() ==0){
            //log
            //throw exception or return 业务规定
        }
        int len =str.length();
        for (int i=0;i<=(len-1)/2;i++){
            char c1=str.charAt(i);
            char c2=str.charAt(len-i-1);
            System.out.println(c1+"    "+c2);

            if(c1!=c2){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String targetStr = null;
        System.out.println(isRecycle(targetStr));
        System.out.println(isRecycleV2(targetStr));
    }
}
