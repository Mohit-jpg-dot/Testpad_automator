int getDays(int sec){
    return sec / (24 * 3600);
}
int getHours(int sec){
    sec = sec % (24 * 3600);
    return sec / 3600;
}
int getMinutes(int sec){
    sec = sec % 3600;
    return sec / 60;
}
int getSeconds(int sec){
    return sec % 60;
}