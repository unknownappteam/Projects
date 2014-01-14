/**
 * 
 */
package com.unknow.app.team.delegate.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import com.unknow.app.team.delegate.annotations.Copy;

/**
 * @author KK
 * 
 */
public class CopyUtil {

	private static final Logger LOGGER = Logger.getLogger(CopyUtil.class);

	public static <T, V> void copy(T src, V target) {

		if (src != null && target != null) {
			try {
				BeanUtils.copyProperties(target, src);
			} catch (IllegalAccessException e) {
				LOGGER.error(e);
			} catch (InvocationTargetException e) {
				LOGGER.error(e);
			}
		}
	}

	public static <T, V> void copyBySrcField(T src, V target) {

		if (src != null && target != null) {
			Field[] fldsArr = src.getClass().getDeclaredFields();

			for (Field field : fldsArr) {
				Copy copy = field.getAnnotation(Copy.class);

				if (copy != null) {
					copyNow(src, target, copy.targetPropertyName(),
							field.getName());
				}
			}

		}
	}

	private static <T, V> void copyNow(T src, V target, String targetPropName,
			String srcPropName) {
		try {
			BeanUtils.setProperty(target, targetPropName,
					BeanUtils.getProperty(src, srcPropName));
		} catch (IllegalAccessException e) {
			LOGGER.error(e);
		} catch (InvocationTargetException e) {
			LOGGER.error(e);
		} catch (NoSuchMethodException e) {
			LOGGER.error(e);
		}
	}
}
