class VowelString {
    public int vowelStrings(String[] words, int left, int right) {
        int out = 0;
        for(int i=left; i<=right; i++){
            String temp = words[i];
            char a = temp.charAt(0);
            char b = temp.charAt(temp.length()-1);
            if((a=='a' || a=='e' || a=='i' || a=='o' || a=='u') && (b=='a' || b=='e' || b=='i' || b=='o' || b=='u')){
                out++;
            }
        }
        return out;
    }
}
