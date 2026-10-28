package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class jt implements SafeParcelable {
    final int bw;
    final String bx;
    public static final jt a = a("accounting");
    public static final jt b = a("airport");
    public static final jt c = a("amusement_park");
    public static final jt d = a("aquarium");
    public static final jt e = a("art_gallery");
    public static final jt f = a("atm");
    public static final jt g = a("bakery");
    public static final jt h = a("bank");
    public static final jt i = a("bar");
    public static final jt j = a("beauty_salon");
    public static final jt k = a("bicycle_store");
    public static final jt l = a("book_store");
    public static final jt m = a("bowling_alley");
    public static final jt n = a("bus_station");
    public static final jt o = a("cafe");
    public static final jt p = a("campground");
    public static final jt q = a("car_dealer");
    public static final jt r = a("car_rental");
    public static final jt s = a("car_repair");
    public static final jt t = a("car_wash");
    public static final jt u = a("casino");
    public static final jt v = a("cemetery");
    public static final jt w = a("church");
    public static final jt x = a("city_hall");
    public static final jt y = a("clothing_store");
    public static final jt z = a("convenience_store");
    public static final jt A = a("courthouse");
    public static final jt B = a("dentist");
    public static final jt C = a("department_store");
    public static final jt D = a("doctor");
    public static final jt E = a("electrician");
    public static final jt F = a("electronics_store");
    public static final jt G = a("embassy");
    public static final jt H = a("establishment");
    public static final jt I = a("finance");
    public static final jt J = a("fire_station");
    public static final jt K = a("florist");
    public static final jt L = a("food");
    public static final jt M = a("funeral_home");
    public static final jt N = a("furniture_store");
    public static final jt O = a("gas_station");
    public static final jt P = a("general_contractor");
    public static final jt Q = a("grocery_or_supermarket");
    public static final jt R = a("gym");
    public static final jt S = a("hair_care");
    public static final jt T = a("hardware_store");
    public static final jt U = a("health");
    public static final jt V = a("hindu_temple");
    public static final jt W = a("home_goods_store");
    public static final jt X = a("hospital");
    public static final jt Y = a("insurance_agency");
    public static final jt Z = a("jewelry_store");
    public static final jt aa = a("laundry");
    public static final jt ab = a("lawyer");
    public static final jt ac = a("library");
    public static final jt ad = a("liquor_store");
    public static final jt ae = a("local_government_office");
    public static final jt af = a("locksmith");
    public static final jt ag = a("lodging");
    public static final jt ah = a("meal_delivery");
    public static final jt ai = a("meal_takeaway");
    public static final jt aj = a("mosque");
    public static final jt ak = a("movie_rental");
    public static final jt al = a("movie_theater");
    public static final jt am = a("moving_company");
    public static final jt an = a("museum");
    public static final jt ao = a("night_club");
    public static final jt ap = a("painter");
    public static final jt aq = a("park");
    public static final jt ar = a("parking");
    public static final jt as = a("pet_store");
    public static final jt at = a("pharmacy");
    public static final jt au = a("physiotherapist");
    public static final jt av = a("place_of_worship");
    public static final jt aw = a("plumber");
    public static final jt ax = a("police");
    public static final jt ay = a("post_office");
    public static final jt az = a("real_estate_agency");
    public static final jt aA = a("restaurant");
    public static final jt aB = a("roofing_contractor");
    public static final jt aC = a("rv_park");
    public static final jt aD = a("school");
    public static final jt aE = a("shoe_store");
    public static final jt aF = a("shopping_mall");
    public static final jt aG = a("spa");
    public static final jt aH = a("stadium");
    public static final jt aI = a("storage");
    public static final jt aJ = a("store");
    public static final jt aK = a("subway_station");
    public static final jt aL = a("synagogue");
    public static final jt aM = a("taxi_stand");
    public static final jt aN = a("train_station");
    public static final jt aO = a("travel_agency");
    public static final jt aP = a("university");
    public static final jt aQ = a("veterinary_care");
    public static final jt aR = a("zoo");
    public static final jt aS = a("administrative_area_level_1");
    public static final jt aT = a("administrative_area_level_2");
    public static final jt aU = a("administrative_area_level_3");
    public static final jt aV = a("colloquial_area");
    public static final jt aW = a("country");
    public static final jt aX = a("floor");
    public static final jt aY = a("geocode");
    public static final jt aZ = a("intersection");
    public static final jt ba = a("locality");
    public static final jt bb = a("natural_feature");
    public static final jt bc = a("neighborhood");
    public static final jt bd = a("political");
    public static final jt be = a("point_of_interest");
    public static final jt bf = a("post_box");
    public static final jt bg = a("postal_code");
    public static final jt bh = a("postal_code_prefix");
    public static final jt bi = a("postal_town");
    public static final jt bj = a("premise");
    public static final jt bk = a("room");
    public static final jt bl = a("route");
    public static final jt bm = a("street_address");
    public static final jt bn = a("sublocality");
    public static final jt bo = a("sublocality_level_1");
    public static final jt bp = a("sublocality_level_2");
    public static final jt bq = a("sublocality_level_3");
    public static final jt br = a("sublocality_level_4");
    public static final jt bs = a("sublocality_level_5");
    public static final jt bt = a("subpremise");
    public static final jt bu = a("transit_station");
    public static final jt bv = a("other");
    public static final mt CREATOR = new mt();

    jt(int i2, String str) {
        ky.a(str);
        this.bw = i2;
        this.bx = str;
    }

    public static jt a(String str) {
        return new jt(0, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        mt mtVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof jt) && this.bx.equals(((jt) obj).bx);
    }

    public int hashCode() {
        return this.bx.hashCode();
    }

    public String toString() {
        return this.bx;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        mt mtVar = CREATOR;
        mt.a(this, parcel, i2);
    }
}
