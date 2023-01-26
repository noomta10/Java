public class Stack {
    private IntNode top;

    public Stack(){
        this.top = null;
    }

    public boolean isEmpty(){
        return this.top == null;
    }

    public void push(int number){
        IntNode template = new IntNode(number, this.top);
        this.top = template;
    }

    public int pop(){
        int template = this.top.getValue();
        this.top = this.top.getNext();
        return template;
    }

    public int top(){
        int template = this.top.getValue();
        return template;
    }

    public String toString(){
        String string = "";
        IntNode template = this.top;
        while (template != null){
            string = string + template.getValue() + "\t";
            template = template.getNext();
        }
        return string;
    }


}
