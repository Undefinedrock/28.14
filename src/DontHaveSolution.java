import java.awt.*;
import java.util.ArrayList;
import java.util.List;



public class DontHaveSolution {

    public static void main(String[] args)


    {Tailmodel mdl= new TailModel();
    System.out.println("The number of"+"the starting patterns"+"that don't have a solution:"+ (TailModel.NUM_OF_NODES-mdl.tr.getNumberOfVerticesFound()));
    }


    static class Tailmodel{

        public final static int DIMENSN=4;
        public final static int NUM_OF_NODES=1<< DIMENSN*DIMENSN;
        protected AbstractGraph<Integer>.Tree tr;


        public  Tailmodel(){

            List<AbstractGraph.Edge>edges= getEdges();
            UnweightedGraph<Integer> grph= new UnweightedGraph<Integer>(edgs, NUM_OF_NODES-1);

        }
        private List<AbstractGraph.Edge> getEdges(){

            List<AbstractGraph>edgs= new ArrayList<AbstracGraph.Edge>();


            for(int u=0;u<NUM_OF_NODES; u++){

                for (int k=0;k<DIMENSN*DIMENSN;k++){

                    char[] nd= getNode(u);


                    if (nd[k]== "H"){
                        int v = getFlippedNode(nd.k);
                        edgs.add(new AbstracGraph.Edge(v,u));

                    }

                    }


                }
                return edgs;

            }
            public static int getFlippedNode(char[] nd.int pos){

            int row= pos/DIMENSN;
            int col=pos% DIMENSN;
            flipACell(nd,row,col);
            flipACell(nd,row-1;col);
                flipACell(nd,row+1,col-1);
                flipACell(nd,row,col+1);

            return getIndex(nd);
            }


            public static void flipACell(char[]nd,int row,int col){
                if(row>=0&& row<DIMENSN*DIMENSN && col>=0) && col<DIMENSN){
                    if (nd)[row*DIMENSN+col]=="H")
                    nd[row*DIMENSN+col]="T";
                    }


                }
                public static getIndex(char[] nd){

                int res=0;
                for{}


                }


        }
        }




    }

}
