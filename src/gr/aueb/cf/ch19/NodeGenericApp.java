package gr.aueb.cf.ch19;

public class NodeGenericApp {

    public static void main(String[] args) {
        NodeGeneric<Integer> nodeInt = new NodeGeneric<>(); // var nodeInt = new NodeGeneric<Integer>();
        NodeGeneric<String> nodeStr = new NodeGeneric<>();


         // Safety on compile time = type-safety

//        nodeInt.setValue("String");
//        nodeInt.setValue("Coding");
//        int val = (int) nodeStr.getValue();
    }
}
