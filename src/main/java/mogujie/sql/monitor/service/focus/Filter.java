/**
 * 
 */
package mogujie.sql.monitor.service.focus;

import mogujie.sql.monitor.entity.product.LogInfoProduct;


/**
 * @author zhaoxi LinZuxiong
 * @email linzuxiong1988@gmail.com
 *
 */
public interface Filter {
    boolean filter(LogInfoProduct product);
}
