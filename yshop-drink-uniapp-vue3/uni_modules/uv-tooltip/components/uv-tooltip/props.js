export default {
	props: {
		// 需要显示的提示文字
		text: {
			type: [String, Number],
			default: ''
		},
		// 点击复制按钮时，复制的文本，为空则使用text值
		copyText: {
			type: [String, Number],
			default: ''
		},
		// 文本大小
		size: {
			type: [String, Number],
			default: 14
		},
		// 字体颜色
		color: {
			type: String,
			default: '#606266'
		},
		// 弹出提示框时，文本的背景色
		bgColor: {
			type: String,
			default: 'transparent'
		},
		// 弹出提示的方向，top-上方，bottom-下方
		direction: {
			type: String,
			default: 'top'
		},
		// 弹出提示的z-index，nvue无效
		zIndex: {
			type: [String, Number],
			default: 10071
		},
		// 是否显示复制按钮
		showCopy: {
			type: Boolean,
			default: true
		},
		// 扩展的按钮组
		buttons: {
			type: Array,
			default: () => []
		},
		// 是否显示透明遮罩以防止触摸穿透
		overlay: {
			type: Boolean,
			default: true
		},
		// 是否显示复制成功或者失败的toast
		showToast: {
			type: Boolean,
			default: true
		},
		...uni.$uv?.props?.tooltip
	}
}