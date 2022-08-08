
   public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        Date date = calendar.getTime();
        Format f = new SimpleDateFormat("EEEE");  
        
        return f.format(date).toUpperCase();
    }