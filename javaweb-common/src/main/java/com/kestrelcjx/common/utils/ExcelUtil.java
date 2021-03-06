package com.kestrelcjx.common.utils;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcelUtil {
    private static final Logger logger = LoggerFactory.getLogger(ExcelUtil.class);
    private static Sheet initSheet;

    static {
        initSheet = new Sheet(1, 0);
        initSheet.setSheetName("sheet");
        // 设置自适应宽度
        initSheet.setAutoWidth(Boolean.TRUE);
    }

    /**
     * 读小于1000行数据，带样式
     * filePath 文件绝对路径
     * initSheet：
     * sheetNo：sheet页码，默认为1
     * headLineNum：从第几行开始读取数据，默认为0，表示从第一行开始读取
     * clazz：返回数据List<Object>中Object的类名
     *
     * @param filePath
     * @param sheet
     * @return
     */
    public static List<Object> readLessThan1000RowBySheet(String filePath, Sheet sheet) {
        if (!StringUtils.hasText(filePath)) {
            return null;
        }
        sheet = sheet != null ? sheet : initSheet;
        InputStream fs = null;
        try {
            fs = new FileInputStream(filePath);
            return EasyExcelFactory.read(fs, sheet);
        } catch (FileNotFoundException e) {
            logger.info("找不到文件或文件路径错误，文件：{}", filePath);
        } finally {
            try {
                if (fs != null) {
                    fs.close();
                }
            } catch (IOException e) {
                logger.info("excel文件读取失败，失败原因：{}", e);
            }
        }
        return null;
    }

    /**
     * 读取小于1000行数据
     *
     * @param filePath 文件绝对路径
     * @return
     */
    public static List<Object> readLessThan1000Row(String filePath) {
        return readLessThan1000RowBySheet(filePath, null);
    }

    /**
     * 读大于1000行数据，带样式
     *
     * @param filePath 文件绝对路径
     * @param sheet
     * @return
     */
    public static List<Object> readMoreThan1000RowBySheet(String filePath, Sheet sheet) {
        if (!StringUtils.hasText(filePath)) {
            return null;
        }
        sheet = sheet != null ? sheet : initSheet;
        InputStream fs = null;
        try {
            fs = new FileInputStream(filePath);
            ExcelListener excelListener = new ExcelListener();
            EasyExcelFactory.readBySax(fs, sheet, excelListener);
            return excelListener.getDatas();
        } catch (FileNotFoundException e) {
            logger.error("找不到文件或文件路径错误，文件：{}", filePath);
        } finally {
            try {
                if (fs != null) {
                    fs.close();
                }
            } catch (IOException e) {
                logger.error("excel文件读取失败，失败原因：{}", e);
            }
        }
        return null;
    }

    /**
     * 读大于1000行数据
     *
     * @param filePath 文件绝对路径
     * @return
     */
    public static List<Object> readMoreThan1000Row(String filePath) {
        return readMoreThan1000RowBySheet(filePath, null);
    }

    /**
     * 生成excel
     *
     * @param filePath excel文件生成绝对路径
     * @param data     数据源
     * @param head     表头
     * @param sheet    excel页面样式
     */
    public static void writeSimpleBySheet(String filePath, List<List<Object>> data,
                                          List<String> head, Sheet sheet) {
        sheet = sheet != null ? sheet : initSheet;
        if (head != null) {
            List<List<String>> list = new ArrayList<>();
            head.forEach(h -> list.add(Collections.singletonList(h)));
            sheet.setHead(list);
        }
        OutputStream os = null;
        ExcelWriter writer = null;
        try {
            os = new FileOutputStream(filePath);
            writer = EasyExcelFactory.getWriter(os);
            writer.write1(data, sheet);
        } catch (FileNotFoundException e) {
            logger.error("找不到文件或文件路径错误，文件：{}", filePath);
        } finally {
            try {
                if (writer != null) {
                    writer.finish();
                }
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                logger.error("excel文件导出失败，失败原因：{}", e);
            }
        }
    }

    /**
     * 生成excel
     *
     * @param filePath excel文件生成绝对路径
     * @param data     数据源
     * @param head     表头
     */
    public static void writeBySimple(String filePath, List<List<Object>> data, List<String> head) {
        writeSimpleBySheet(filePath, data, head, null);
    }

    /**
     * 生成excel
     *
     * @param filePath excel文件生成绝对路径
     * @param data     数据源
     * @param sheet    excel页面样式
     */
    public static void writeWithTemplateAndSheet(
            String filePath, List<? extends BaseRowModel> data, Sheet sheet) {
        if (CollectionUtils.isEmpty(data)) {
            return;
        }
        sheet = sheet != null ? sheet : initSheet;
        sheet.setClazz(data.get(0).getClass());
        OutputStream os = null;
        ExcelWriter writer = null;
        try {
            os = new FileOutputStream(filePath);
            writer = EasyExcelFactory.getWriter(os);
            writer.write(data, sheet);
        } catch (FileNotFoundException e) {
            logger.error("找不到文件或文件路径错误，文件：{}", filePath);
        } finally {
            try {
                if (writer != null) {
                    writer.finish();
                }
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                logger.error("excel文件导出失败，失败原因：{}", e);
            }
        }
    }

    /**
     * 生成excel
     *
     * @param filePath excel文件生成绝对路径
     * @param data     数据源
     */
    public static void writeWithTemplate(String filePath, List<? extends BaseRowModel> data) {
        writeWithTemplateAndSheet(filePath, data, null);
    }

    /**
     * 生成多Sheet的excel
     *
     * @param filePath                excel文件生成绝对路径
     * @param multipleSheetProperties
     */
    public static void writeWithMultipleSheet(
            String filePath, List<MultipleSheetProperty> multipleSheetProperties) {
        if (CollectionUtils.isEmpty(multipleSheetProperties)) {
            return;
        }
        OutputStream os = null;
        ExcelWriter writer = null;
        try {
            os = new FileOutputStream(filePath);
            writer = EasyExcelFactory.getWriter(os);
            for (MultipleSheetProperty multipleSheetProperty : multipleSheetProperties) {
                Sheet sheet = multipleSheetProperty.getSheet() != null ?
                        multipleSheetProperty.getSheet() : initSheet;
                if (!CollectionUtils.isEmpty(multipleSheetProperty.getData())) {
                    sheet.setClazz(multipleSheetProperty.getData().get(0).getClass());
                }
                writer.write(multipleSheetProperty.getData(), sheet);
            }
        } catch (FileNotFoundException e) {
            logger.error("找不到文件或文件路径错误，文件：{}", filePath);
        } finally {
            try {
                if (writer != null) {
                    writer.finish();
                }
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                logger.error("excel文件导出失败，失败原因：{}", e);
            }
        }
    }

    /***********************内部类**************************/

    public static class MultipleSheetProperty {
        private List<? extends BaseRowModel> data;
        private Sheet sheet;

        public List<? extends BaseRowModel> getData() {
            return data;
        }

        public void setData(List<? extends BaseRowModel> data) {
            this.data = data;
        }

        public Sheet getSheet() {
            return sheet;
        }

        public void setSheet(Sheet sheet) {
            this.sheet = sheet;
        }
    }

    public static class ExcelListener extends AnalysisEventListener {
        private List<Object> datas = new ArrayList<>();

        public List<Object> getDatas() {
            return datas;
        }

        public void setDatas(List<Object> datas) {
            this.datas = datas;
        }

        /**
         * 逐行解析
         *
         * @param o               当前行的数据
         * @param analysisContext
         */
        @Override
        public void invoke(Object o, AnalysisContext analysisContext) {
            if (o != null) {
                datas.add(o);
            }
        }

        /**
         * 解析完成所有数据后会调用该方法
         *
         * @param analysisContext
         */
        @Override
        public void doAfterAllAnalysed(AnalysisContext analysisContext) {
            // 解析结束销毁不用的资源
        }
    }
}
