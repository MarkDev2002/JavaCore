package GraphColoring;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");
        Vertex vertexG = new Vertex("G");
        Vertex vertexH = new Vertex("H");
        Vertex vertexI = new Vertex("I");
        Vertex vertexJ = new Vertex("J");
        Vertex vertexK = new Vertex("K");
        Vertex vertexL = new Vertex("L");


        vertexA.addAdjacency(vertexC);
        vertexA.addAdjacency(vertexD);
        vertexA.addAdjacency(vertexG);
        vertexA.addAdjacency(vertexF);
        vertexA.addAdjacency(vertexI);

        vertexB.addAdjacency(vertexH);
        vertexB.addAdjacency(vertexK);
        vertexB.addAdjacency(vertexL);

        vertexC.addAdjacency(vertexA);
        vertexC.addAdjacency(vertexD);
        vertexC.addAdjacency(vertexG);

        vertexD.addAdjacency(vertexA);
        vertexD.addAdjacency(vertexC);
        vertexD.addAdjacency(vertexG);

        vertexE.addAdjacency(vertexJ);
        vertexE.addAdjacency(vertexL);

        vertexF.addAdjacency(vertexA);
        vertexF.addAdjacency(vertexI);

        vertexG.addAdjacency(vertexA);
        vertexG.addAdjacency(vertexC);
        vertexG.addAdjacency(vertexD);

        vertexH.addAdjacency(vertexB);
        vertexH.addAdjacency(vertexK);
        vertexH.addAdjacency(vertexL);

        vertexI.addAdjacency(vertexA);
        vertexI.addAdjacency(vertexF);

        vertexJ.addAdjacency(vertexE);
        vertexJ.addAdjacency(vertexL);

        vertexK.addAdjacency(vertexB);
        vertexK.addAdjacency(vertexH);
        vertexK.addAdjacency(vertexL);

        vertexL.addAdjacency(vertexB);
        vertexL.addAdjacency(vertexH);
        vertexL.addAdjacency(vertexK);
        vertexL.addAdjacency(vertexE);
        vertexL.addAdjacency(vertexJ);

        ArrayList<Vertex> vertexList = new ArrayList<>();
        vertexList.add(vertexA);
        vertexList.add(vertexB);
        vertexList.add(vertexC);
        vertexList.add(vertexD);
        vertexList.add(vertexE);
        vertexList.add(vertexF);
        vertexList.add(vertexG);
        vertexList.add(vertexH);
        vertexList.add(vertexI);
        vertexList.add(vertexJ);
        vertexList.add(vertexK);
        vertexList.add(vertexL);

        Algorithm algo = new Algorithm(vertexList);
        algo.WelshPowell();
        //algo.DSATUR();
    }
}
