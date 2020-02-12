package com.neuedu.zuoye0211;

import java.util.ArrayList;
import java.util.Random;

public class WerewolfKillDealer {
    //村民Villagers 狼人Werewolves 守卫Savior 预言家Seer 猎人Hunter
    //丘比特Cupid 长老Acient 盗贼Thief 替罪羊Scapegoat 女巫Witch
    //村民，狼人，守护，预言家，猎人，丘比特，长老，盗贼，替罪羊，女巫
    private String[] dealer = {"Villagers","Werewolves","Savior","Seer","Hunter",
            "Cupid","Acient", "Thief","Scapegoat","Witch"};

    public void randomGeneration(){
        RandomSettings rs = new RandomSettings();
        int a = new Random().nextInt(7)+12;
        ArrayList arry = new ArrayList();
        switch (a){
            case 12:
                String[] arr = {"村民","村民","村民","村民",
                        "狼人","狼人","狼人","狼人",
                        "预言家","女巫","丘比特","守护","猎人","村长","盗贼"};
                rs.Settings(arr,12);
                break;
            case 13:
                String[] arr2 = {"村民","村民","村民","村民","村民",
                        "狼人","狼人","狼人","狼人",
                        "预言家","女巫","丘比特","守护","猎人","村长","盗贼"};
                rs.Settings(arr2,13);
                break;
            case 14:
                String[] arr3 = {"村民","村民","村民","村民","村民",
                        "狼人","狼人","狼人","狼人",
                        "预言家","女巫","丘比特","守护","猎人","村长","替罪羊","盗贼"};
                rs.Settings(arr3,14);
                break;
            case 15:
                String[] arr4 = {"村民","村民","村民","村民","村民",
                        "狼人","狼人","狼人","狼人","狼人",
                        "守护","预言家","猎人", "丘比特","长老", "盗贼","替罪羊","女巫"};
                rs.Settings(arr4,15);
                break;
            case 16:
                String[] arr5 = {"村民","村民","村民","村民","村民","村民",
                        "狼人","狼人","狼人","狼人","狼人",
                        "预言家","女巫","丘比特","守护","猎人","村长","替罪羊","盗贼"};
                rs.Settings(arr5,16);
                break;
            case 17:
                String[] arr6 = {"村民","村民","村民","村民","村民","村民","村民",
                        "狼人","狼人","狼人","狼人","狼人",
                        "预言家","女巫","丘比特","守护","猎人","村长","替罪羊","盗贼"};
                rs.Settings(arr6,17);
                break;
            case 18:
                 String[] arr7 = {"村民","村民","村民","村民","村民","村民","村民",
                "狼人","狼人","狼人","狼人","狼人",
                "预言家","女巫","丘比特","守护","猎人","村长","替罪羊","吹笛者","盗贼"};
                rs.Settings(arr7,18);
                break;
        }
    }

    public void fixed(){
        //固定15张牌
        /*String[] arr = {"Villagers","Villagers","Villagers","Villagers","Villagers",
                "Werewolves","Werewolves","Werewolves","Werewolves","Werewolves",
                "Savior","Seer","Hunter", "Cupid","Acient", "Thief","Scapegoat","Witch"};*/
        String[] arr = {"村民","村民","村民","村民","村民",
                "狼人","狼人","狼人","狼人","狼人",
                "守护","预言家","猎人", "丘比特","长老", "盗贼","替罪羊","女巫"};
        /*RandomSettings rs = new RandomSettings();
        rs.Settings(arr,15);*/
        int count=0;
        ArrayList array = new ArrayList();
        a:while(true){
            b:while(true){
                if(count<18){
                    int ar = new Random().nextInt(18);
                    if(arr[ar]!=null){
                        array.add(arr[ar]);
                        arr[ar]=null;
                        count++;
                    }
                }
                //所有牌排好顺序后跳出本循环
                if(count>=18){break b;}
            }
            //判断前15张牌是否有盗贼，狼人数是否大于等于4，都满足就跳出整个循环
            int count2 = 0;
            for(int i = 0; i <= array.size()-3;i++){
                if(array.get(i).toString().equals("狼人")){count2++;}
                if(array.get(i).toString().equals("盗贼")&&count2>=4){break a;}
            }
        }
        //打印牌名
        for (int i = 0; i<array.size();i++){
            if (i<15){
                System.out.println(array.get(i));
            }else{
                System.out.println("底牌："+array.get(i));
            }
        }
    }
}
