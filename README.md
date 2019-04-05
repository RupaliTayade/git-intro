# git-intro
package April3;

public class Hw {
        public static void main(String []args){
            int sum=0;
            int i;
            for(i=1;i<=1000;i++){
                if((i%3==0)|| (i%5==0)){
                    sum=sum+i;
                }
            }
            System.out.println(sum);
        }
    }
