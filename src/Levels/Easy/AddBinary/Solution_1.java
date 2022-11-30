package Levels.Easy.AddBinary;



public class Solution_1 {
    public String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();

        int i=a.length()-1;
        int j=b.length()-1;

        int temp = 0;

        while(i>=0 || j>=0){
            int sum=0;

            if(i>=0 && a.charAt(i)=='1'){
                sum++;
            }

            if(j>=0 && b.charAt(j)=='1'){
                sum++;
            }

            sum += temp;

            if(sum>=2){
                temp=1;
            }else{
                temp=0;
            }

            sb.insert(0,  (char) ((sum%2) + '0'));

            i--;
            j--;
        }

        if(temp==1)
            sb.insert(0, '1');

        return sb.toString();

    }
}
