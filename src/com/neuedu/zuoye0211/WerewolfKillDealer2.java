package com.neuedu.zuoye0211;

import java.util.*;

public class WerewolfKillDealer2 {
    public static void main(String[] args) {
        System.out.println("请输入游戏人数：");
        Scanner scanner = new Scanner(System.in);
        int player = scanner.nextInt();
        if(player<12 || player>18){
            System.out.println("超出游戏人数范围");
            /*while (player>=12&&player<=18){

            }*/
        }else {
            List<String> all = new ArrayList<>();
            List<String> play = new ArrayList<>();
            List<String> dipai = new ArrayList<>();
            init(all);
            sumInit(all,player);
            all.remove("盗贼");
            play.add("盗贼");
            di(all,dipai);
            play.addAll(all);
            Collections.shuffle(play);
            System.out.println("玩家手牌为："+play);
            System.out.println("盗贼底牌为："+dipai);
        }
    }
    //初始化
    public static void init(List<String> all){
        for (int i = 0; i < 4; i++){
            all.add("狼人");
        }
        for (int i = 0; i < 4; i++){
            all.add("村民");
        }
        all.add("预言家");
        all.add("女巫");
        all.add("丘比特");
        all.add("守护");
        all.add("猎人");
        all.add("村长");
        all.add("盗贼");
    }
    //根据人数添加一些牌
    public static void sumInit(List<String> all,int player){
        if(player>12)
            all.add("村民");
        if(player>13)
            all.add("替罪羊");
        if(player>14)
            all.add("狼人");
        if(player>15)
            all.add("村民");
        if(player>16)
            all.add("村民");
        if(player>17)
            all.add("吹笛者");
    }
    //从总牌中拿出3张底牌
    public static void di(List<String> all,List<String> dipai){
        while (dipai.size()<3){
            Random r = new Random();
            int n = r.nextInt(all.size());
            if(all.get(n).equals("狼人")&&dipai.contains("狼人"))
                continue;
            else
                dipai.add(all.remove(n));
        }
    }

}
