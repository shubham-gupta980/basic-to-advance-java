                            //    problem 1 ---> subString
// public class string {
//     public static String subString(String str, int si, int ei) {
//         String subString = "";
//         for (int i=si; i<ei; i++) {
//             subString += str.charAt(i);
//         }
//         return subString;
//     }
//     public static void main(String[] args) {
//         String str = "HelloWorld";
//         System.out.println(subString(str, 0, 5));
//     }
// }

                                //  problem 2 --->route containaing four direction
// public class string {
//     public static float directionPath(String str) {
//         int x=0, y=0;
//         for (int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == 'S') {
//                 y--;
//             }
//             else if (ch == 'N') {
//                 y++;
//             }
//             else if (ch == 'E') {
//                 x++;
//             }
//             else {
//                 x--;
//             }
//         }
//         int x2 = x*x;
//         int y2 = y*y;
//         return (float)Math.sqrt(x2+y2);
//     }
//     public static void main(String[] args) {
//         String name = "WNEENESENNN";
//         System.out.println(directionPath(name));
//     }
// }

                                    //  problem 3  ---> Reverse and string
// public class string {
//     public static void main(String[] args) {
//         String str = "Shubham";
//         int l = str.length()-1;
//         for (int i=l; i>=0; i--) {
//             System.out.println(str.charAt(i));
//         }
//     }
// }   

// Second approach

// public class string {
//     public static void main(String[] args) {
//         StringBuilder name = new StringBuilder("Shubham");
//         for (int i=0;i<name.length()/2; i++) {
//             int front = i;
//             int back = name.length()-1 -i-1;

//             char frontchar = name.charAt(front);
//             char backchar = name.charAt(back);

//             name.setCharAt(front,backchar);
//             name.setCharAt(back, frontchar);
//         }
//         System.out.println(name);
//     }
// }


                                            //   problem 4 ---> palingdrom or not
// public class string {
//     public static boolean palingdrom(String str) {
//         int l = str.length();
//         int n = l/2;
//         for (int i=0; i<n; i++) {
//             if (str.charAt(i) != str.charAt(l-i-1) ) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String name = "maam";
//         System.out.println(palingdrom(name));
//     }
// }