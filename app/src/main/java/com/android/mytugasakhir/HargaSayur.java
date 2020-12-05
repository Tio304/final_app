package com.android.mytugasakhir;

import java.util.ArrayList;

public class HargaSayur {
    private static final String[] namebusa = {
            "Bawang Bombay",
            "Brokoli",
            "Jagung",
            "Jamur",
            "Kacang polong",
            "kentang",
            "Kubis",
            "Labu",
            "Mentimun",
            "Paprika",
            "Selada",
            "Seledri",
            "Tomat",
            "Wortel",


    };
    private static final String[] hargabusa = {
            "Rp. 19.000/kg",
            "Rp. 20.000/kg",
            "Rp. 17.000/kg",
            "Rp. 15.000/kg",
            "Rp. 30.000/kg",
            "Rp. 15.000/kg",
            "Rp. 3.000/kg",
            "Rp. 25.000/kg",
            "Rp. 4.000/kg",
            "Rp. 35.000/kg",
            "Rp. 25.000/kg",
            "Rp. 10.000/kg",
            "Rp. 13.000/kg",
            "Rp. 15.000/kg",


    };

    private static final int[] photobusa = {
            R.drawable.s_bombai,
            "https://assets.pikiran-rakyat.com/crop/0x0:0x0/x/photo/2020/03/16/3869311889.jpg",
            R.drawable.s_jagung,
            R.drawable.s_jamur,
            R.drawable.s_kacang,
            R.drawable.s_kentang,
            R.drawable.s_kubis,
            R.drawable.s_labu,
            "https://disk.mediaindonesia.com/thumbs/600x400/news/2018/08/d43f67d3fae91cb015b614cf1d00442c.jpg",
            "https://cdn.shopify.com/s/files/1/0050/4895/9064/products/paprikamerah_1200x1200.png?v=1585913631",
            R.drawable.s_selada,
            "https://cdn1-production-images-kly.akamaized.net/-2bpmUlN_IRUxXMA5VlCCc7Wkhs=/640x480/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2747948/original/062944400_1552286201-iStock-623751248.jpg",
            "https://res.cloudinary.com/dk0z4ums3/image/upload/v1534576505/attached_image/9-manfaat-tomat-buah-yang-disangka-sayur-alodokter.jpg",
            "https://doktersehat.com/wp-content/uploads/2018/06/wortel-untuk-rambut-doktersehat-1-1.jpeg",
    };


    public static ArrayList<BuahSayur> getListData() {
        ArrayList<BuahSayur> list = new ArrayList<>();
        for (int position = 0; position < namebusa.length; position++) {
            BuahSayur buahsayur = new BuahSayur();
            buahsayur.setNamebusa(namebusa[position]);
            buahsayur.setHargabusa(hargabusa[position]);
            buahsayur.setPhotobusa(photobusa[position]);

            list.add(buahsayur);
        }
        return list;
    }

}
