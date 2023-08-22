package LeetCode.Test;

import LeetCode.Main;
import com.sun.xml.internal.ws.util.StringUtils;

import javax.jnlp.ClipboardService;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ;
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


/**
 * @author LuSheng
 * @title: LeetCodeTest
 * @projectName leetcode
 * @description: TODO
 */
public class LeetCodeTest {

    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int stone : stones){
            sum += stone;
        }
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for(int i = 0 ; i < stones.length ; i++){
            for(int j = target ; j >= stones[i] ; j--){
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - 2 * dp[target];

    }




    public static void main(String[] args) {
        LeetCodeTest leetCodeTest = new LeetCodeTest();
    }


    static class General<T> implements General1<String> {
        private T target;

        public void setTarget(T target) {
            this.target = target;
        }

        public T getTarget() {
            return this.target;
        }

        @Override
        public <T> void printArray(T[] array) {
            for (T t : array) {
                System.out.println(t);
            }
        }
    }

    interface General1<T> {

        public <T> void printArray(T[] array);
    }


}




























