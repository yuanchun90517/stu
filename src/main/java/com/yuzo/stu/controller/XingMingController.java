package com.yuzo.stu.controller;

import com.yuzo.stu.entity.Ming;
import com.yuzo.stu.entity.Xing;
import com.yuzo.stu.service.IXingMingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class XingMingController {

    @Autowired
    private IXingMingService service;

    @RequestMapping("xm/addXing")
    @ResponseBody
    public Integer addXing(){
        String xings = "赵 钱 孙 李 周 吴 郑 王 冯 陈 褚 卫 "
                + "蒋 沈 韩 杨 朱 秦 尤 许 何 吕 施 张 "
                + "孔 曹 严 华 金 魏 陶 姜 戚 谢 邹 喻 "
                + "柏 水 窦 章 云 苏 潘 葛 奚 范 彭 郎 "
                + "鲁 韦 昌 马 苗 凤 花 方 "
                + "俞 任 袁 柳 酆 鲍 史 唐 "
                + "费 廉 岑 薛 雷 贺 倪 汤 "
                + "滕 殷 罗 毕 郝 邬 安 常 "
                + "乐 于 时 傅 皮 卞 齐 康 "
                + "伍 余 元 卜 顾 孟 平 黄 "
                + "和 穆 萧 尹 姚 邵 湛 汪 "
                + "祁 毛 禹 狄 米 贝 明 臧 "
                + "计 伏 成 戴 谈 宋 茅 庞 "
                + "熊 纪 舒 屈 项 祝 董 梁 "
                + "杜 阮 蓝 闵 席 季 麻 强 "
                + "贾 路 娄 危 江 童 颜 郭 "
                + "梅 盛 林 刁 钟 徐 邱 骆 "
                + "高 夏 蔡 田 樊 胡 凌 霍 "
                + "虞 万 支 柯 咎 管 卢 莫 "
                + "经 房 裘 缪 干 解 应 宗 "
                + "宣 丁 贲 邓 郁 单 杭 洪 "
                + "包 诸 左 石 崔 吉 钮 龚 "
                + "程 嵇 邢 滑 裴 陆 荣 翁 "
                + "荀 羊 於 惠 甄 魏 加 封 "
                + "芮 羿 储 靳 汲 邴 糜 松 "
                + "井 段 富 巫 乌 焦 巴 弓 "
                + "牧 隗 山 谷 车 侯 宓 蓬 "
                + "全 郗 班 仰 秋 仲 伊 宫 "
                + "宁 仇 栾 暴 甘 钭 厉 戎 "
                + "祖 武 符 刘 姜 詹 束 龙 "
                + "叶 幸 司 韶 郜 黎 蓟 薄 "
                + "印 宿 白 怀 蒲 台 从 鄂 "
                + "索 咸 籍 赖 卓 蔺 屠 蒙 "
                + "池 乔 阴 郁 胥 能 苍 双 "
                + "闻 莘 党 翟 谭 贡 劳 逄 "
                + "姬 申 扶 堵 冉 宰 郦 雍 "
                + "却 璩 桑 桂 濮 牛 寿 通 "
                + "边 扈 燕 冀 郏 浦 尚 农 "
                + "温 别 庄 晏 柴 瞿 阎 充 "
                + "慕 连 茹 习 宦 艾 鱼 容 "
                + "向 古 易 慎 戈 廖 庚 终 "
                + "暨 居 衡 步 都 耿 满 弘 "
                + "匡 国 文 寇 广 禄 阙 东 "
                + "殴 殳 沃 利 蔚 越 夔 隆 "
                + "师 巩 厍 聂 晁 勾 敖 融 "
                + "冷 訾 辛 阚 那 简 饶 空 "
                + "曾 毋 沙 乜 养 鞠 须 丰 "
                + "巢 关 蒯 相 查 后 江 红 "
                + "游 竺 权 逯 盖 益 桓 公 "
                + "万俟 司马 上官 欧阳 夏侯 诸葛 闻人 东方 赫连 皇甫 尉迟 公羊 "
                + "澹台 公冶 宗政 濮阳 淳于 仲孙 太叔 申屠 公孙 乐正 轩辕 令狐 "
                + "钟离 闾丘 长孙 慕容 鲜于 宇文 司徒 司空 亓官 司寇 仉督 子车 "
                + "颛孙 端木 巫马 公西 漆雕 乐正 壤驷 公良 拓拔 夹谷 宰父 谷粱 "
                + "晋楚 阎法 汝鄢 涂钦 段干 百里 东郭 南门 呼延 归海 羊舌 微生 "
                + "岳帅 缑亢 况后 有琴 梁丘 左丘 东门 西门 商牟 佘佴 伯赏 南宫 墨哈 谯笪 年爱 阳佟";
        Integer count = 0;

        String[] xs = xings.split(" ");
        for (String x : xs) {
            Xing xing = new Xing();
            xing.setXing(x);
            count += service.add(xing);
        }

        return count;
    }

    @RequestMapping("xm/addMing")
    @ResponseBody
    public Integer addMing(){
        String mings = "碧凡、夏菡、曼香、若烟、半梦、雅绿、冰蓝、灵槐、平安、书翠、翠风、香巧、代云、"
                + "友巧、听寒、梦柏、醉易、访旋、亦玉、凌萱、访卉、怀亦、笑蓝、春翠、靖柏、书雪、"
                + "乐枫、念薇、靖雁、寻春、恨山、从寒、忆香、觅波、静曼、凡旋、新波、代真、新蕾、"
                + "雁玉、冷卉、紫山、千琴、恨天、傲芙、盼山、怀蝶、冰兰、问旋、从南、白易、问筠、"
                + "如霜、半芹、寒雁、怜云、寻文、谷雪、乐萱、涵菡、海莲、傲蕾、青槐、冬儿、易梦、"
                + "惜雪、宛海、之柔、夏青、"
                + "秀、娟、英、华、慧、巧、美、娜、静、淑、惠、珠、翠、雅、芝、玉、萍、红、娥、玲、芬、芳、燕、彩、春、菊、兰、凤、洁、梅、琳、"
                + "素、云、莲、真、环、雪、荣、爱、妹、霞、香、月、莺、媛、艳、瑞、凡、佳、嘉、琼、勤、珍、贞、莉、桂、娣、叶、璧、璐、娅、琦、"
                + "晶、妍、茜、秋、珊、莎、锦、黛、青、倩、婷、姣、婉、娴、瑾、颖、露、瑶、怡、婵、雁、蓓、纨、仪、荷、丹、蓉、眉、君、琴、蕊、"
                + "薇、菁、梦、岚、苑、婕、馨、瑗、琰、韵、融、园、艺、咏、卿、聪、澜、纯、毓、悦、昭、冰、爽、琬、茗、羽、希、宁、欣、飘、育、"
                + "滢、馥、筠、柔、竹、霭、凝、晓、欢、霄、枫、芸、菲、寒、伊、亚、宜、可、姬、舒、影、荔、枝、思、丽、"
                + "伟、刚、勇、毅、俊、峰、强、军、平、保、东、文、辉、力、明、永、健、世、广、志、义、兴、良、海、山、仁、波、宁、贵、福、生、龙、元、全、国、胜、学、祥、才、发、武、新、利、清、飞、彬、富、"
                + "顺、信、子、杰、涛、昌、成、康、星、光、天、达、安、岩、中、茂、进、林、有、坚、和、彪、博、诚、先、敬、震、振、壮、会、思、群、"
                + "豪、心、邦、承、乐、绍、功、松、善、厚、庆、磊、民、友、裕、河、哲、江、超、浩、亮、政、谦、亨、奇、固、之、轮、翰、朗、伯、宏、言、若、"
                + "鸣、朋、斌、梁、栋、维、启、克、伦、翔、旭、鹏、泽、晨、辰、士、以、建、家、致、树、炎、德、行、时、泰、盛、雄、琛、钧、冠、策、"
                + "腾、楠、榕、风、航、弘";
        Integer count = 0;

        String[] ms = mings.split("、");
        for (String m : ms) {
            Ming ming = new Ming();
            ming.setMing(m);
            count += service.addMing(ming);
        }
        return count;
    }

}
