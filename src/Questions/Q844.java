package Questions;

public class Q844 {
//    �ⷨ1�� �����ⷨ������S��T�õ�����ֵ,Ȼ����бȽ�
	public boolean backspaceCompare(String S, String T) {
		 if(build(S).equals(build(T))) {
			 return true;
		 } else {
			 return false;
		 }
	    }
	public String build(String S) {
		 StringBuffer r = new StringBuffer();
		 for(int i = 0; i<S.length(); i++) {
			 if(S.charAt(i) != '#') {
				 r.append(S.charAt(i));
			 } else {
				 if(r.length()>0) {
					 r.deleteCharAt(r.length()-1);
				 }
			 }
		 }
		 return r.toString();
	}
	 
	 
//		�ⷨ2���Ӻ���ǰ����������ָ���Ӧ��Ҫ�Ƚϵ��ַ�λ��ָ��
	public boolean backspaceCompare2(String S, String T) {
		return true;
	}
	
	public char nextChar(String S,int s) {
		int skip = 0;
		int i = s;
		while(S.charAt(i) == '#') {
			i=i-1;
		}
		if(s-skip < 0) {
			return '*';
		} else {
			return S.charAt(s-skip);
		}
	}
}
