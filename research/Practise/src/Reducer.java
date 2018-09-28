public class Reducer<A extends PrimitiveType,B extends PrimitiveType> {
    public <A extends PrimitiveType,B extends PrimitiveType> void reduce(A key, Iterable<B> valz){
        double sum=0;
        for(B val:valz){
            sum += (double)val.get();
        }
        System.out.println("Output " + key.get() + " : " + sum);
    }
}
