package com.lyf.common.exception.file;

import com.lyf.common.exception.base.BaseException;

/**
 * 文件信息异常类
 * 
 * @author numberone
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
