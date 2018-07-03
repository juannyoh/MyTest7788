package gson;

/**
 * 搜索操作类型
 * 
 * @author guoping
 *
 */
public interface SearchType {

    /**
     * 文本
     * 
     * @author guoping
     *
     */
    public enum StringTypeEnum implements SearchType {
        // Endwith,
        /**
         * 等于
         */
        Equals, 
        /**
         * 不等�?
         */
        NotEquals, 
        /**
         * 包含
         */
        Contains,NotContains, 
        /**
         * 包含(标准分析器切词后分词等于)
         */
        StandardContains, 
        /**
         * �?���?
         */
        Startwith,NotStartwith,
        /**
         * 结束�?
         */
        Endwith,NotEndwith,
        /**
         * 是否存在
         */
        Exists,NotExists;
    }

    /**
     * 数字和时�?
     * 
     * @author guoping
     *
     */
    public enum NumberDateTypeEnum implements SearchType {
        /**
         * 等于
         */
        Equals,NotEquals, 
        /**
         * 大于
         */
        Gt, 
        /**
         * 大于等于
         */
        Gte, 
        /**
         * 小于
         */
        Lt, 
        /**
         * 小于等于
         */
        Lte, 
        /**
         * 是否存在
         */
        Exists,NotExists;
    }
    
    /**
     * 空间查询
     * 
     * @author guoping
     *
     */
    public enum GeoTypeEnum implements SearchType {
        Intersection,
        Within,
        
        /**
         * 是否存在
         */
        Exists,NotExists;
    }

}
