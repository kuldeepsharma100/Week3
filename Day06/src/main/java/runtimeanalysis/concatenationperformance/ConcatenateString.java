package runtimeanalysis.concatenationperformance;

public class ConcatenateString {
    public static void concatenate(int n){
        String str = "java";
        for(int i = 0; i<n; i++){
            str +="java";
        }
    }

    public static void concatenateBuilder(int n){
        String str = "java";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            sb.append(str);
        }
    }
    public static void concatenateBuffer(int n){
        String str = "java";
        StringBuffer sf = new StringBuffer();
        for(int i = 0; i<n; i++){
            sf.append(str);
        }
    }
}
