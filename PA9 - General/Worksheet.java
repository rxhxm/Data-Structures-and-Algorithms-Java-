import java.util.*;





/**
 * Java file that stores answers to problem 1(huffman encoding) and problem 2(B-tree)
 */

 public class Worksheet {

    public static class HuffmanNode {
        public char c;
        public int freq;
        public String path;

        public HuffmanNode(char c, int freq, String path) {
            this.c = c;
            this.freq = freq;
            this.path = path;
        }
    }

    public static class BNode {
        public List<Integer> data;
        public List<BNode> children;

        public BNode(List<Integer> data) {
            this.data = data;
            this.children = new ArrayList<BNode>();
        }
        public void setChildren(List<BNode> children){
            this.children = children;
        }

        public void addChildren(BNode node){
            this.children.add(node);
        }

        public void addChild(BNode child) {
            this.children.add(child);
        }




    /**
     * Answer to q1(a)
     * @return arrayList consisting HuffmanNodes, where each node stores info about an encoded character
     */
    public static ArrayList<HuffmanNode> q1aEncodeChar(){
        /*TODO: insert nodes into an ArrayList, where each node stores the frequency and path of a character */
        ArrayList<HuffmanNode> nodeList = new ArrayList<HuffmanNode>();
        //Example code on adding nodes: nodeList.add(new HuffmanNode('p', 2, "0001"));
        nodeList.add(new HuffmanNode('d', 1, "00110"));
        nodeList.add(new HuffmanNode('s', 6, "110"));
        nodeList.add(new HuffmanNode('c', 6, "0101"));
        nodeList.add(new HuffmanNode('2', 6, "0010"));
        nodeList.add(new HuffmanNode('0', 6, "01"));
        nodeList.add(new HuffmanNode('h', 6, "0001"));
        nodeList.add(new HuffmanNode('w', 6, "111"));
        nodeList.add(new HuffmanNode('1', 1, "10001"));
        nodeList.add(new HuffmanNode('3', 1, "10010"));
        nodeList.add(new HuffmanNode('4', 1, "10011"));
        nodeList.add(new HuffmanNode('5', 1, "0000"));
        nodeList.add(new HuffmanNode('6', 1, "0001"));
        nodeList.add(new HuffmanNode('\n', 5, "101"));
        return nodeList;
    }

    /**
     * Answer to q1(b)
     * @return arrayList consisting HuffmanNodes, where each node stores info about an encoded character
     */
    public static ArrayList<HuffmanNode> q1bEncodeChar(){
        /*TODO: insert nodes into an ArrayList, where each node stores the frequency and path of a character */
        ArrayList<HuffmanNode> nodeList = new ArrayList<HuffmanNode>();
        //Example code on adding nodes: nodeList.add(new HuffmanNode('p', 2, "0001"));
        nodeList.add(new HuffmanNode('T', 1, "0000"));
        nodeList.add(new HuffmanNode('h', 1, "0011"));
        nodeList.add(new HuffmanNode('e', 2, "100"));
        nodeList.add(new HuffmanNode(' ', 3, "101"));
        nodeList.add(new HuffmanNode('s', 3, "110"));
        nodeList.add(new HuffmanNode('u', 1, "0010"));
        nodeList.add(new HuffmanNode('m', 2, "1111"));
        nodeList.add(new HuffmanNode('r', 1, "0100"));
        nodeList.add(new HuffmanNode('i', 1, "0110"));
        nodeList.add(new HuffmanNode('c', 1, "0111"));
        nodeList.add(new HuffmanNode('l', 1, "1110"));
        nodeList.add(new HuffmanNode('o', 1, "0101"));
        nodeList.add(new HuffmanNode('!', 1, "0001"));
        return nodeList;
    }


    // Method to add child nodes



    /**
     * Answer to 2(a)
     * @return a list of BNodes
     */
    public static ArrayList<BNode> q2EncodeTree(){
        /*TODO: insert BNodes into a nodeList, where each node stores the data and path of a character */
        ArrayList<BNode> nodeList = new ArrayList<BNode>();
        //example of adding nodes to nodeList : nodeList.add(new BNode(Arrays.asList(17,24)));
        ArrayList<Integer> data;
        ArrayList<BNode> children;
    
        
        BNode node25_26_32 = new BNode(new ArrayList<>(Arrays.asList(25, 26, 32)));
        BNode node39_41 = new BNode(new ArrayList<>(Arrays.asList(39, 41)));
        BNode node51 = new BNode(new ArrayList<>(Arrays.asList(51)));
        BNode node59_62 = new BNode(new ArrayList<>(Arrays.asList(59, 62)));
        BNode node76 = new BNode(new ArrayList<>(Arrays.asList(76)));
        BNode node87 = new BNode(new ArrayList<>(Arrays.asList(87)));

        BNode node33_44_52 = new BNode(new ArrayList<>(Arrays.asList(33, 44, 52)));
        node33_44_52.addChild(node25_26_32);
        node33_44_52.addChild(node39_41);
        node33_44_52.addChild(node51);
        node33_44_52.addChild(node59_62);

        BNode node79 = new BNode(new ArrayList<>(Arrays.asList(79)));
        node79.addChild(node76);
        node79.addChild(node87);

        BNode root = new BNode(new ArrayList<>(Arrays.asList(69)));
        root.addChild(node33_44_52);
        root.addChild(node79);

        nodeList.add(node25_26_32);
        nodeList.add(node39_41);
        nodeList.add(node51);
        nodeList.add(node59_62);
        nodeList.add(node76);
        nodeList.add(node87);
        nodeList.add(node33_44_52);
        nodeList.add(node79);
        nodeList.add(root);

        return nodeList;

    }

    public static void main(String[] args) {
        ArrayList<BNode> nodes = q2EncodeTree();
        System.out.println("number of nodes  = "+nodes.size());
        for(int i = nodes.size()-1;i>=0;i--){
            List<BNode> children = nodes.get(i).children;
            String output = "";
            output+="current data = "+nodes.get(i).data+"\n";
            output+="children = ";
            if(children.size()==0){
                output+="None";
            }
            for(int j=0;j<children.size();j++){
                output+=children.get(j).data;
            }
            System.out.println(output);
            System.out.println("____________________");
        }
    }
}
