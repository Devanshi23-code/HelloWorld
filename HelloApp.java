public class HelloApp{
    public static void main(String[] args){
        boolean first = true;
        StringBuilder nameBuilder = new StringBuilder();
        for(String name :args){
            if(!first){
                nameBuilder.append(",");
            }
            nameBuilder.append(name);
            first = false;
        }
}
}