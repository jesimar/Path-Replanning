/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProOF.gen.codification.Integer;

import ProOF.gen.operator.oMutation;
import ProOF.opt.abst.problem.meta.Problem;

/**
 *
 * @author marcio
 */
public class iIntMutRandom extends oMutation<Problem, cInteger>{
    @Override
    public String name(){
        return "Invert";
    }
    @Override
    public void mutation(Problem mem, cInteger ind) throws Exception {
        int i = mem.rnd.nextInt(ind.cromo.length);
        ind.cromo[i] = mem.rnd.nextInt(ind.min(i), ind.max(i));
    }
};
