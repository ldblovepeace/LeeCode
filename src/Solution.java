
public class Solution {
	public boolean isLongPressedName(String name, String typed) {
        // ����ָ���¼typed�ַ�����λ��
        int t = 0;
        for(int i=0;i<name.length();i++){
            // ����name�ַ�������typed�Ƚ�
            if(name.charAt(i) != typed.charAt(t)){
                // ����ַ�����ȣ�typed�ַ���ǰһ���Ƚ��Ƿ���ȣ����ͨ�������򷵻�false
                if(t==0 || t >= typed.length()){
                    // �����һ���ַ��Ͳ���ȷ���false�������ڴ����
                    return false;
                    }
                else if(typed.charAt(t) != typed.charAt(t-1)){
                    // ���typed�ַ���ǰһ���ַ�����������false
                    return false;
                }
                else if(typed.charAt(t) == typed.charAt(t-1)){
                    // ���typed�ַ���ǰһ����ͬ���ҵ���һ�����ظ����ַ����бȽ�
                    while(typed.charAt(t) == typed.charAt(t-1)){
                        t=t+1;
                    }
                    if(typed.charAt(t)!=name.charAt(i)){
                        return false;
                    }
                    if(typed.charAt(t)==name.charAt(i)) {
                    	t=t+1;
                    }
                } 
            } else{
                // �ַ�����ȣ���������
                t=t+1;
            }
        }
        // ������name�ַ��������typed�и������ݣ�ȷ�Ϻ����ַ���name���һ���ַ���ͬ
        while(t < typed.length()){
            if(typed.charAt(t)!=typed.charAt(t-1)){
                return false;
            }
            t++;
        }
        return true;
    }
}
