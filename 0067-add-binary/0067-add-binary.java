class Solution {
    public String addBinary(String a, String b) {
        int n1=a.length();
        int n2=b.length();
        StringBuilder res=new StringBuilder();
        n1=n1-1;
        n2=n2-1;
        char carry='0';
        while(n1>=0 && n2>=0){
            if(a.charAt(n1)=='1' && b.charAt(n2)=='1')
            {
                 if(carry=='1'){
                    res.insert(0,'1');
                    
                 }
                 else
                 {
                   res.insert(0,'0');
                 }
                 carry='1';
            }
            else if(a.charAt(n1)=='1' || b.charAt(n2)=='1'){
                if(carry=='1'){
                     res.insert(0,'0');
                     carry='1';
            }
                 else{
                   res.insert(0,'1');
                    carry='0';
               }
            }
            else{
                
                 res.insert(0,carry);
                 carry='0';
            }
            n1--;
            n2--;
        }
        while(n1>=0){
            if(carry=='0'){
                res.insert(0,a.charAt(n1));
            }
            else{
                if(a.charAt(n1)=='1')
                {
                    res.insert(0,'0');
                     carry='1';
                }
               else{
                  res.insert(0,'1');  
                  carry='0';
                  }
            }
            n1--;
        }
        while(n2>=0){
            if(carry=='0'){
                res.insert(0,b.charAt(n2));
            }
            else{
                if(b.charAt(n2)=='1')
                {
                    res.insert(0,'0');
                    carry='1';
                }
               else{
                  res.insert(0,'1');  
                  carry='0';
                  }
            }
            n2--;
        }
        if(carry=='1')
           res.insert(0,carry);
        return res.toString();
        
    }
}