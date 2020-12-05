package com.android.mytugasakhir;

import java.util.ArrayList;

public class HargaBuah {
    private static final String[] namebusa = {
            "Alpukat",
            "Apel",
            "Delima",
            "Durian",
            "Jambu biji",
            "Jeruk",
            "Kelengkeng",
            "Kiwi",
            "Lemon",
            "Manggis",
            "Semangka",
            "Naga",
            "Nanas",
            "Pepaya",
            "Pisang",
            "Strawberry",

    };
    private static final String[] hargabusa = {
            "Rp. 45.000/kg",
            "Rp. 25.000/kg",
            "Rp. 50.000/kg",
            "Rp. 60.000/kg",
            "Rp. 15.000/kg",
            "Rp. 15.000/kg",
            "Rp. 45.000/kg",
            "Rp. 45.000/kg",
            "Rp. 50.000/kg",
            "Rp. 35.000/kg",
            "Rp. 35.000/kg",
            "Rp. 20.000/kg",
            "Rp. 15.000/kg",
            "Rp. 17.000/kg",
            "Rp. 25.000/kg",
            "Rp. 15.000/kg",


    };

    private static final int[] photobusa = {
            "https://image-cdn.medkomtek.com/B9AhXWnOWkFFuMvaBULjtHX1bP4=/640x360/smart/klikdokter-media-buckets/medias/2316313/original/077508000_1594124422-Buah-Alpukat-Bisa-Memperbesar-Ukuran-Payudara-Mitos-atau-Fakta-shutterstock_420965665.jpg",
            "https://assets.pikiran-rakyat.com/crop/452x301:4071x2713/x/photo/2020/09/19/3575864449.jpg",
            R.drawable.delima,
            R.drawable.durian,
            R.drawable.jambu,
            "https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2020/06/Blog_Manfaat-Jeruk-Buah-Termasyhur-yang-Penuh-Nutrisi.jpg",
            R.drawable.kalengkeng,
            R.drawable.kiwi,
            R.drawable.lemon,
            "https://lh3.googleusercontent.com/proxy/7WHTA2T3d9WAbR4FCC_TmHWMAiw8n9uUyLftANeQ2y7s-qKQbrS59D3ox7hFQQlZpD84D0qZvJ51gyA9JO0KTXYJw4UbYZVra-z8HtjoaRSlRwmdzOE",
            "https://cdn.idntimes.com/content-images/community/2019/06/pic-2-5ca1d27955f6a-660x400-a2a425a49fa50b90a5d4fad17a00faf2_600x400.jpg",
            "https://cms.sehatq.com/public/img/article_img/benarkah-ada-manfaat-buah-naga-untuk-ibu-hamil-ini-penjelasannya-1579490849.jpg",
            "https://totabuan.news/wp-content/uploads/2020/01/Nanas.jpg",
            "https://tokohinspiratif.id/wp-content/uploads/2019/11/Pepaya_California_Super_segar_dan_manis.jpg",
            "https://img.okezone.com/content/2020/05/15/298/2214844/ciri-ciri-pisang-matang-sempurna-bReK2YGBA0.jpg",
            "https://s4.bukalapak.com/img/405995961/large/StrawberryExtract100ml_1_scaled.jpg",
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
