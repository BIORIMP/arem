package unalcol.optimization.binary.varlength;

import unalcol.clone.Clone;
import unalcol.random.raw.RawGenerator;
import unalcol.search.space.ArityOne;
import unalcol.types.collection.bitarray.BitArray;


/**
 * <p>Title: DelGen</p>
 * <p>Description: The gene deletion operator.  Deletes a gene in the genome</p>
 * <p>Copyright: Copyright (c) 2010</p>
 *
 * @author Jonatan Gomez
 * @version 1.0
 */

public class DelGen extends ArityOne<BitArray> {
    /**
     * If the last gene is going to be deleted or one randomly selected
     */
    protected boolean del_last_gene = true;

    protected int gene_size;
    protected int min_length;
    protected int max_length;


    public DelGen(int gene_size, int min_length, int max_length) {
        this.gene_size = gene_size;
        this.min_length = min_length;
        this.max_length = max_length;
    }


    /**
     * Constructor: create a deletion gene operator that deletes a gene of a genome
     *
     * @param gene_size     Number of bits defining a gene
     * @param min_length    Minimum number of genes in the chromosome
     * @param max_length    Maximun number of genes in the chromosome
     * @param del_last_gene Determines if the gene to be deleted is the last in
     *                      the genome or not. A true value indicates that the last gene is deleted.
     *                      A false value indiciates that a gene is randomly selected and deleted
     */
    public DelGen(int gene_size, int min_length, int max_length, boolean del_last_gene) {
        this(gene_size, min_length, max_length);
        this.del_last_gene = del_last_gene;
    }

    /**
     * Testing function
     */
    public static void main(String[] argv) {
        System.out.println("*** Generating a genome of 27 genes randomly ***");
        BitArray genome = new BitArray(27, true);
        System.out.println(genome.toString());

        System.out.println("*** Generating a Deletion Gen operation with gen length of 3 ***");
        DelGen del = new DelGen(21, 27, 3);

        System.out.println("*** Applying the deletion ***");
        BitArray gene = del.apply(genome);

        System.out.println("*** Mutated genome ***");
        System.out.println(gene);

    }

    /**
     * Delete from the given genome the last gene
     *
     * @param gen Genome to be modified
     */
    public BitArray apply(BitArray gen) {
        try {
            BitArray genome = (BitArray) Clone.create(gen);
            if (genome.size() > min_length + gene_size) {
                if (del_last_gene) {
                    genome.del(gene_size);
                } else {
                    int size = (genome.size() - min_length) / gene_size;
                    int k = RawGenerator.get(this).integer(size + 1);
                    BitArray right = genome.subBitArray(min_length + (k + 1) * gene_size);
                    genome.del((size - k) * gene_size);
                    genome.add(right);
                }
            }
            return genome;
        } catch (Exception e) {
        }
        return null;
    }
}
