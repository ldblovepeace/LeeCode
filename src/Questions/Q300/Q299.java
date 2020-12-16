package Questions.Q300;

public class Q299 {
    public String getHint(String secret, String guess) {
        int n = secret.length();
        if (n<0) {
            return "0A0B";
        }
        
        char[] secretRecord = new char[10];
        char[] guessRecord = new char[10];

        int bulls = 0;
        int cows = 0;
        
        for(int i=0; i<n; i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            }
            secretRecord[secret.charAt(i) - '0'] ++;
            guessRecord[guess.charAt(i) - '0'] ++;
        }
        
        for(int i=0; i<10; i++) {
            cows = cows + Math.min(secretRecord[i], guessRecord[i]);
        }
        
        cows = cows - bulls;
        
        return bulls +"A" + cows + "B";
    }
}
