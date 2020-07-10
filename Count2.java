//每十位数里会出现一个 2。但 2x 是个例外，会多出现 10 个 2 也就是每百位数里会出现 20 个 2。（2、12、22、
//32...92 + 20、21、22...29）。但 2xx 是个例外，会多出现 100 个 2 依次类推即可根据 n 的值直接得出 2 的个数
import java.util.*;
public class Count2 {
  public int countNumberOf2s(int n) {
    int count = 0; // 最终 2 的个数
    int factor = 1; // 从低位到高位计算 2 的个数
    int low = 0; // 屏蔽掉低位
    int current = 0; // 当前计算位数的值
    int high = 0; // 计算高位
    while(n / factor != 0) {
      low = n - (n / factor) * factor;
      current = (n / factor) % 10;
      high = n / (factor * 10);
// 根据当前的
      switch(current){
        case 0:
        case 1:
          count += high * factor;
          break;
        case 2:
          count += high * factor + low + 1;
          break;
        default:
          count += (high + 1) * factor;
          break;
     }
      factor *= 10;
   }

    return count;
 }
}