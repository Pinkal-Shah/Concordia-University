public class IntWritable implements PrimitiveType {
    int val;
    IntWritable(int someVal){
        this.val = someVal;
    }
    IntWritable(){
        this.val = 0;
    }

    public void set(Object x){
        this.val = (int)x;
    }

    public void set(int x){
        this.set(new Integer(x));
    }

    public Object get(){
        return new Object(this.val);
    }

    public void add(Integer x){
        this.val += (int)x.get();
    }
}
