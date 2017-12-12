package com.beautifulsoup.service.article;

import com.beautifulsoup.BlogApplicationTests;
import com.beautifulsoup.bean.db.Article;
import com.beautifulsoup.service.ArticleService;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by BeautifulSoup on 2017/12/8.
 */
public class ArticleServiceTest extends BlogApplicationTests {

    @Autowired
    private ArticleService articleService;

    @Test
    public void insertArticle(){
        Article article1=new Article("EventBus使用详解(一)","EventBus是一款针对Android优化的发布/订阅事件总线。主要功能是替代Intent,Handler,BroadCast在Fragment，Activity，Service，线程之间传递消息.优点是开销小，代码更优雅。以及将发送者和接收者解耦。",
        "EventBus是一款针对Android优化的发布/订阅事件总线。主要功能是替代Intent,Handler,BroadCast在Fragment，Activity，Service，线程之间传递消息.优点是开销小，代码更优雅。以及将发送者和接收者解耦。"
        ,"224",6,6,new Date(),"给大家装简单演示了EventBus的onEventMainThread（）函数的接收，其实EventBus还有另外有个不同的函数，他们分别是：\n" +
                "\n" +
                "1、onEvent\n" +
                "2、onEventMainThread\n" +
                "3、onEventBackgroundThread\n" +
                "4、onEventAsync\n" +
                "\n" +
                "这四种订阅函数都是使用onEvent开头的，它们的功能稍有不同,在介绍不同之前先介绍两个概念：\n" +
                "告知观察者事件发生时通过EventBus.post函数实现，这个过程叫做事件的发布，观察者被告知事件发生叫做事件的接收，是通过下面的订阅函数实现的。\n" +
                "\n" +
                "onEvent:如果使用onEvent作为订阅函数，那么该事件在哪个线程发布出来的，onEvent就会在这个线程中运行，也就是说发布事件和接收事件线程在同一个线程。使用这个方法时，在onEvent方法中不能执行耗时操作，如果执行耗时操作容易导致事件分发延迟。\n" +
                "onEventMainThread:如果使用onEventMainThread作为订阅函数，那么不论事件是在哪个线程中发布出来的，onEventMainThread都会在UI线程中执行，接收事件就会在UI线程中运行，这个在Android中是非常有用的，因为在Android中只能在UI线程中跟新UI，所以在onEvnetMainThread方法中是不能执行耗时操作的。\n" +
                "onEventBackground:如果使用onEventBackgrond作为订阅函数，那么如果事件是在UI线程中发布出来的，那么onEventBackground就会在子线程中运行，如果事件本来就是子线程中发布出来的，那么onEventBackground函数直接在该子线程中执行。\n" +
                "onEventAsync：使用这个函数作为订阅函数，那么无论事件在哪个线程发布，都会创建新的子线程在执行onEventAsync.");

        Article article2=new Article("Android5.0之NavigationView的使用方式","Android5.0之MaterialDesign的NavigationView的使用方式","导航菜单的制作方式多种多样，网上也有各种炫酷效果的具体实现方式，那么今天我主要是想来说说Google在Android5.0之后推出的NavigationView的具体使用方式。","156",6,6,new Date(),"OK，看完了图，接下来我们就来说说这个NavigationView吧。\n" +
                "1.NavigationView是什么\n" +
                "\n" +
                "long long ago，我们做抽屉菜单的时候，左边滑出来的那一部分的布局都是由我们自己来定义的，自己写的话，花点时间也能做出来好看的侧拉菜单，但总是要耗费时间，于是Google在5.0之后推出了NavitationView，就是我们左边滑出来的那个菜单。这个菜单整体上分为两部分，上面一部分叫做HeaderLayout，下面的那些点击项都是menu，这样的效果如果我们要自己写肯定也能写出来，但是没有必要，既然Google提供了这个控件，那我们就来看看这个控件要怎么用吧。\n" +
                "2.NavigationView怎么用\n" +
                "\n" +
                "和普通的侧拉菜单制作方式一样，首先所有的东西还是都放在一个DrawerLayout中（如果你对DrawerLayout的使用还不熟悉，请参考这篇文章使用DrawerLayout实现侧拉菜单），只不过这次我们把左边滑出菜单的布局用一个NavigationView来代替，代码如下：\n" +
                "\n" +
                "[java] view plain copy\n" +
                "print?\n" +
                "\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "    <android.support.v4.widget.DrawerLayout  \n" +
                "        xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
                "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"  \n" +
                "        xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
                "        android:layout_width=\"match_parent\"  \n" +
                "        android:layout_height=\"match_parent\"  \n" +
                "        tools:context=\"org.mobiletrain.drawerlayout.MainActivity\">  \n" +
                "      \n" +
                "        <LinearLayout  \n" +
                "            android:layout_width=\"match_parent\"  \n" +
                "            android:layout_height=\"match_parent\"  \n" +
                "            android:orientation=\"vertical\">  \n" +
                "      \n" +
                "            <TextView  \n" +
                "                android:layout_width=\"wrap_content\"  \n" +
                "                android:layout_height=\"wrap_content\"  \n" +
                "                android:text=\"主页面\"/>  \n" +
                "        </LinearLayout>  \n" +
                "      \n" +
                "        <android.support.design.widget.NavigationView  \n" +
                "            android:id=\"@+id/navigation_view\"  \n" +
                "            android:layout_width=\"wrap_content\"  \n" +
                "            android:layout_height=\"match_parent\"  \n" +
                "            android:layout_gravity=\"left\"  \n" +
                "            android:fitsSystemWindows=\"true\"  \n" +
                "            app:headerLayout=\"@layout/header_layout\"  \n" +
                "            app:menu=\"@menu/main\"></android.support.design.widget.NavigationView>  \n" +
                "    </android.support.v4.widget.DrawerLayout>  \n" +
                "\n" +
                "OK，下面我来分别解释一下这里边几个属性的含义：\n" +
                "\n" +
                "1.android:layout_gravity=\"left\"属性表示该View是左边的滑出菜单，这个属性的含义不用多说，这是DrawerLayout使用方式中的知识点。\n" +
                "\n" +
                "2.app:headerLayout=\"@layout/header_layout\"表示引用一个头布局文件，这个头就是我们在上面看到的那个背景图片，包括背景图片上面的显示用户名的控件等等。\n" +
                "\n" +
                "3.app:menu=\"@menu/main\"表示引用一个menu作为下面的点击项\n" +
                "\n" +
                "OK，那我们再来看看头布局文件：\n" +
                "\n" +
                "[java] view plain copy\n" +
                "print?\n" +
                "\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "    <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
                "                  android:layout_width=\"match_parent\"  \n" +
                "                  android:layout_height=\"200dp\"  \n" +
                "                  android:orientation=\"vertical\">  \n" +
                "      \n" +
                "        <ImageView  \n" +
                "            android:id=\"@+id/iv\"  \n" +
                "            android:layout_width=\"match_parent\"  \n" +
                "            android:layout_height=\"match_parent\"  \n" +
                "            android:scaleType=\"centerCrop\"  \n" +
                "            android:src=\"@drawable/p1\"/>  \n" +
                "    </LinearLayout>  \n" +
                "\n" +
                "\n" +
                "再来看看menu文件：\n" +
                "\n" +
                "[java] view plain copy\n" +
                "print?\n" +
                "\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "    <menu xmlns:android=\"http://schemas.android.com/apk/res/android\">  \n" +
                "        <item  \n" +
                "            android:id=\"@+id/favorite\"  \n" +
                "            android:icon=\"@mipmap/ic_launcher\"  \n" +
                "            android:title=\"收藏\"/>  \n" +
                "        <item  \n" +
                "            android:id=\"@+id/wallet\"  \n" +
                "            android:icon=\"@mipmap/ic_launcher\"  \n" +
                "            android:title=\"钱包\"/>  \n" +
                "        <item  \n" +
                "            android:id=\"@+id/photo\"  \n" +
                "            android:icon=\"@mipmap/ic_launcher\"  \n" +
                "            android:title=\"相册\"/>  \n" +
                "        <item  \n" +
                "            android:id=\"@+id/file\"  \n" +
                "            android:icon=\"@mipmap/ic_launcher\"  \n" +
                "            android:title=\"文件\"/>  \n" +
                "    </menu>  ");
        Article article3=new Article("如何利用TensorFlow来训练聊天机器人","训练聊天机器人。",
                "实际工程中很少有直接用深度学习实现端对端的聊天机器人，但这里我们来看看怎么用深度学习的seq2seq模型来实现一个简易的聊天机器人。这篇文章将尝试使用TensorFlow来训练一个基于seq2seq的聊天机器人，实现根据语料库的训练让机器人回答问题。"
                ,"330",6,30,new Date(),"seq2seq\n" +
                "\n" +
                "关于seq2seq的机制原理可看之前的文章《深度学习的seq2seq模型》。\n" +
                "\n" +
                "循环神经网络\n" +
                "\n" +
                "在seq2seq模型中会使用到循环神经网络，目前流行的几种循环神经网络包括RNN、LSTM和GRU。这三种循环神经网络的机制原理可看之前的文章《循环神经网络》 《LSTM神经网络》 《GRU神经网络》。\n" +
                "\n" +
                "训练样本集\n" +
                "\n" +
                "主要是一些QA对，开放数据也很多可以下载，这里只是随便选用一小部分问题和回答，存放的格式是第一行为问题，第二行为回答，第三行又是问题，第四行为回答，以此类推。\n" +
                "\n" +
                "数据预处理\n" +
                "\n" +
                "要训练就肯定要将数据转成数字，可以用0到n的值来表示整个词汇，每个值表示一个单词，这里用VOCAB_SIZE来定义。还有问题的最大最小长度，回答的最大最小长度。除此之外还要定义UNK、GO、EOS和PAD符号，分别表示未知单词，比如你超过 VOCAB_SIZE范围的则认为未知单词，GO表示decoder开始的符号，EOS表示回答结束的符号，而PAD用于填充，因为所有QA对放到同个seq2seq模型中输入和输出都必须是相同的，于是就需要将较短长度的问题或回答用PAD进行填充。\n" +
                "\n" +
                "limit = {\n" +
                "    'maxq': 10,\n" +
                "    'minq': 0,\n" +
                "    'maxa': 8,\n" +
                "    'mina': 3\n" +
                "}\n" +
                "\n" +
                "UNK = 'unk'\n" +
                "GO = '<go>'\n" +
                "EOS = '<eos>'\n" +
                "PAD = '<pad>'\n" +
                "VOCAB_SIZE = 1000\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10\n" +
                "11\n" +
                "12\n" +
                "按照QA长度的限制进行筛选。\n" +
                "\n" +
                "def filter_data(sequences):\n" +
                "    filtered_q, filtered_a = [], []\n" +
                "    raw_data_len = len(sequences) // 2\n" +
                "\n" +
                "    for i in range(0, len(sequences), 2):\n" +
                "        qlen, alen = len(sequences[i].split(' ')), len(sequences[i + 1].split(' '))\n" +
                "        if qlen >= limit['minq'] and qlen <= limit['maxq']:\n" +
                "            if alen >= limit['mina'] and alen <= limit['maxa']:\n" +
                "                filtered_q.append(sequences[i])\n" +
                "                filtered_a.append(sequences[i + 1])\n" +
                "    filt_data_len = len(filtered_q)\n" +
                "    filtered = int((raw_data_len - filt_data_len) * 100 / raw_data_len)\n" +
                "    print(str(filtered) + '% filtered from original data')\n" +
                "\n" +
                "    return filtered_q, filtered_a\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10\n" +
                "11\n" +
                "12\n" +
                "13\n" +
                "14\n" +
                "15\n" +
                "我们还要得到整个语料库所有单词的频率统计，还要根据频率大小统计出排名前n个频率的单词作为整个词汇，也就是前面对应的VOCAB_SIZE。另外我们还需要根据索引值得到单词的索引，还有根据单词得到对应索引值的索引。\n" +
                "\n" +
                "def index_(tokenized_sentences, vocab_size):\n" +
                "    freq_dist = nltk.FreqDist(itertools.chain(*tokenized_sentences))\n" +
                "    vocab = freq_dist.most_common(vocab_size)\n" +
                "    index2word = [GO] + [EOS] + [UNK] + [PAD] + [x[0] for x in vocab]\n" +
                "    word2index = dict([(w, i) for i, w in enumerate(index2word)])\n" +
                "    return index2word, word2index, freq_dist\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "前面也说到在我们的seq2seq模型中，对于encoder来说，问题的长短是不同的，那么不够长的要用PAD进行填充，比如问题为”how are you”，假如长度定为10，则需要将其填充为”how are you pad pad pad pad pad pad pad”。对于decoder来说，要以GO开始，以EOS结尾，不够长还得填充，比如”fine thank you”，则要处理成”go fine thank you eos pad pad pad pad pad “。第三个要处理的则是我们的target，target其实和decoder的输入是相同的，只不过它刚好有一个位置的偏移，比如上面要去掉go，变成”fine thank you eos pad pad pad pad pad pad”");
        Article article4=new Article("分布式系统调用链监控","分布式系统调用链监控",
                "应用架构由集中式向分布式演进后，整个调用关系变得复杂。\n" +
                        "分布式架构由复杂且较大规模集群构成，各个应用之间相当独立，可能由不同团队、不同语言实现。\n"
                ,"160",6,9,new Date(),"一个请求完整的调用链可能如下图，经过多个系统服务，调用关系复杂。\n" +
                "\n" +
                "这里写图片描述\n" +
                "\n" +
                "期间我们会关注各个调用的各项性能指标，比如吞吐量（TPS）、响应时间及错误记录等。\n" +
                "\n" +
                "吞吐量，根据拓扑可相应计算组件、平台、物理设备的实时吞吐量。\n" +
                "响应时间，包括整体调用的响应时间和各个服务的响应时间等。\n" +
                "错误记录，根据服务返回统计单位时间异常次数。\n" +
                "全链路性能监控从整体维度到局部维度展示各项指标，将跨应用的所有调用链性能信息集中展现，可方便度量整体和局部性能，并且方便找到故障产生的源头，生产上可极大缩短故障排除时间。\n" +
                "\n" +
                "Google Dapper\n" +
                "\n" +
                "系统整个调用链 \n" +
                "1. 当用户发起一个请求时，首先到达前端A服务，然后分别对B服务和C服务进行RPC调用； \n" +
                "2. B服务处理完给A做出响应，但是C服务还需要和后端的D服务和E服务交互之后再返还给A服务，最后由A服务来响应用户的请求； \n" +
                "这里写图片描述\n" +
                "\n" +
                "对整个调用过程的追踪 \n" +
                "1. 请求到来生成一个全局TraceID，通过TraceID可以串联起整个调用链，一个TraceID代表一次请求。 \n" +
                "2. 除了TraceID外，还需要SpanID用于记录调用父子关系。每个服务会记录下parent id和span id，通过他们可以组织一次完整调用链的父子关系。 \n" +
                "3. 一个没有parent id的span成为root span，可以看成调用链入口。 \n" +
                "4. 所有这些ID可用全局唯一的64位整数表示； \n" +
                "5. 整个调用过程中每个请求都要透传TraceID和SpanID。 \n" +
                "6. 每个服务将该次请求附带的TraceID和附带的SpanID作为parent id记录下，并且将自己生成的SpanID也记录下。 \n" +
                "7. 要查看某次完整的调用则只要根据TraceID查出所有调用记录，然后通过parent id和span id组织起整个调用父子关系。");
        Article article5=new Article(" Java Develop——基于 Redis 的分布式锁 ","Java Develop——基于 Redis 的分布式锁 ",
                "分布式锁应用场景都是用在高并发，大流量场景。."
                ,"160",4,30,new Date(),"1.用Apache ab压测模拟并发\n" +
                "\n" +
                "ab 的使用非常简单：\n" +
                "\n" +
                "//-n模拟100个请求，-c模拟100个并发\n" +
                "ab -n 100 -c 100 http://www.example.com/\n" +
                "\n" +
                "//-t模拟60秒，-c模拟100个并发，它会在连续60秒内不停的发请求\n" +
                "ab -t 60 -c 100 http://www.example.com/\n" +
                "\n" +
                "例如常见的秒杀系统，秒杀数据放在 MySQL 这类数据库中时，通过 select…for update 手工加锁可以避免超卖现象。但是为了提升查询速度，常将这些数据放在内存、Redis 中，压测后会发现出现了超卖的现象针对这个现象，可以通过 synchronized 关键字加锁处理并发：\n" +
                "\n" +
                "/**\n" +
                " * 秒杀的方法\n" +
                " */\n" +
                "public synchronized void orderProductMockDiffUser(String productId) {\n" +
                "}\n" +
                "\n" +
                "    1\n" +
                "    2\n" +
                "    3\n" +
                "    4\n" +
                "    5\n" +
                "\n" +
                "这样处理后，再次压测，会发现时间变成了，这是因为加锁处理后，每次访问方法的线程只会有一个线程。这种方法是一种解决方法，但是无法做到细粒度的控制。上面是秒杀的同一个商品的场景，假如说现在有很多商品，每个商品 id 不一样，但是它们都会访问同一个秒杀方法，这会造成一个现象，假如秒杀商品 A 的人非常多，秒杀商品 B 的人非常少，但是两个都会非常慢，因为它们每次访问方法的线程只会有一个线程，无法做到细粒度的控制。还有重要的一点是，这种方法只适合单点的情况，如果水平扩展后 (集群)，不同的用户看到的是五花八门的。基于这个问题，就引出了基于 Redis 的分布式锁。\n" +
                "2.基于 Redis 的分布式锁\n" +
                "\n" +
                "首先看两个 Redis 的命令：\n" +
                "\n" +
                "SETNX key value\n" +
                "将key设置值为value，如果key不存在，这种情况下等同SET命令。 当key存在时，什么也不做。SETNX是”SET if Not eXists”的简写。\n" +
                "参考: http://www.redis.cn/commands/setnx.html\n" +
                "\n" +
                "GETSET key value\n" +
                "自动将key对应到value并且返回原来key对应的value。如果key存在但是对应的value不是字符串，就返回错误。\n" +
                "参考: http://www.redis.cn/commands/getset.html\n" +
                "\n" +
                "基于 Redis 的分布式锁其实就是在秒杀的方法前后进行加锁、解锁操作：\n" +
                "\n" +
                "/**\n" +
                " * 秒杀的方法\n" +
                " */\n" +
                "public void orderProductMockDiffUser(String productId) {\n" +
                "    //加锁\n" +
                "    //...\n" +
                "    //解锁\n" +
                "}\n" +
                "\n" +
                "    1\n" +
                "    2\n" +
                "    3\n" +
                "    4\n" +
                "    5\n" +
                "    6\n" +
                "    7\n" +
                "    8\n" +
                "\n" +
                "下面新建一个 Redis 分布式锁的处理，把加锁和解锁写进来：\n" +
                "\n" +
                "@Component\n" +
                "@Slf4j\n" +
                "public class RedisLock {\n" +
                "    private Logger logger = LoggerFactory.getLogger(getClass());\n" +
                "    @Autowired\n" +
                "    private StringRedisTemplate redisTemplate;\n" +
                "\n" +
                "    /**\n" +
                "     * 加锁\n" +
                "     *\n" +
                "     * @param key\n" +
                "     * @param value 当前时间+超时时间\n" +
                "     * @return\n" +
                "     */\n" +
                "    public boolean lock(String key, String value) {\n" +
                "        //SETNX命令, 可以设置返回true, 不可以返回false\n" +
                "        if (redisTemplate.opsForValue().setIfAbsent(key, value)) {\n" +
                "            return true;\n" +
                "        }\n" +
                "        String currentValue = redisTemplate.opsForValue().get(key);\n" +
                "        //如果锁过期\n" +
                "        if (StringUtils.isEmpty(currentValue)\n" +
                "                && (Long.parseLong(currentValue) < System.currentTimeMillis())) {\n" +
                "            //GETSET命令, 获取上一个锁的时间\n" +
                "            String oldValue = redisTemplate.opsForValue().getAndSet(key, value);\n" +
                "            if (!StringUtils.isEmpty(oldValue) && oldValue.equals(value)) {\n" +
                "                return true;\n" +
                "            }\n" +
                "        }\n" +
                "        return false;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 解锁\n" +
                "     */\n" +
                "    public void unLock(String key, String value) {\n" +
                "        try {\n" +
                "            String currentValue = redisTemplate.opsForValue().get(key);\n" +
                "            if (!StringUtils.isEmpty(currentValue)\n" +
                "                    && currentValue.equals(value)) {\n" +
                "                redisTemplate.opsForValue().getOperations().delete(key);\n" +
                "            }\n" +
                "        } catch (Exception e) {\n" +
                "            logger.error(\"【redis分布式锁】解锁异常, {}\", e);\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "    47\n" +
                "\n" +
                "使用就很简单了：\n" +
                "\n" +
                "private static final int TIMEOUT = 10 * 1000; //超时时间10秒\n" +
                "@Autowired\n" +
                "private RedisLock redisLock;\n" +
                "/**\n" +
                " * 秒杀的方法\n" +
                " */\n" +
                "public void orderProductMockDiffUser(String productId) {\n" +
                "    //加锁\n" +
                "    long time = System.currentTimeMillis() + TIMEOUT;\n" +
                "    if(!redisLock.lock(productId, String.valueOf(time))) {\n" +
                "        throw new SellException(101, \"人也太多了, 换个姿势再试试～\");\n" +
                "    };\n" +
                "    //...\n" +
                "    //解锁\n" +
                "    redisLock.unLock(productId, String.valueOf(time));\n" +
                "}\n" +
                "\n" +
                "\n" +
                "到此就完成了分布式锁的处理。");
        Article article6=new Article("EventBus使用详解(一)","EventBus是一款针对Android优化的发布/订阅事件总线。主要功能是替代Intent,Handler,BroadCast在Fragment，Activity，Service，线程之间传递消息.优点是开销小，代码更优雅。以及将发送者和接收者解耦。",
                "EventBus是一款针对Android优化的发布/订阅事件总线。主要功能是替代Intent,Handler,BroadCast在Fragment，Activity，Service，线程之间传递消息.优点是开销小，代码更优雅。以及将发送者和接收者解耦。"
                ,"224",6,9,new Date(),"给大家装简单演示了EventBus的onEventMainThread（）函数的接收，其实EventBus还有另外有个不同的函数，他们分别是：\n" +
                "\n" +
                "1、onEvent\n" +
                "2、onEventMainThread\n" +
                "3、onEventBackgroundThread\n" +
                "4、onEventAsync\n" +
                "\n" +
                "这四种订阅函数都是使用onEvent开头的，它们的功能稍有不同,在介绍不同之前先介绍两个概念：\n" +
                "告知观察者事件发生时通过EventBus.post函数实现，这个过程叫做事件的发布，观察者被告知事件发生叫做事件的接收，是通过下面的订阅函数实现的。\n" +
                "\n" +
                "onEvent:如果使用onEvent作为订阅函数，那么该事件在哪个线程发布出来的，onEvent就会在这个线程中运行，也就是说发布事件和接收事件线程在同一个线程。使用这个方法时，在onEvent方法中不能执行耗时操作，如果执行耗时操作容易导致事件分发延迟。\n" +
                "onEventMainThread:如果使用onEventMainThread作为订阅函数，那么不论事件是在哪个线程中发布出来的，onEventMainThread都会在UI线程中执行，接收事件就会在UI线程中运行，这个在Android中是非常有用的，因为在Android中只能在UI线程中跟新UI，所以在onEvnetMainThread方法中是不能执行耗时操作的。\n" +
                "onEventBackground:如果使用onEventBackgrond作为订阅函数，那么如果事件是在UI线程中发布出来的，那么onEventBackground就会在子线程中运行，如果事件本来就是子线程中发布出来的，那么onEventBackground函数直接在该子线程中执行。\n" +
                "onEventAsync：使用这个函数作为订阅函数，那么无论事件在哪个线程发布，都会创建新的子线程在执行onEventAsync.");

        Article article7=new Article("Android5.0之NavigationView的使用方式","Android5.0之MaterialDesign的NavigationView的使用方式","导航菜单的制作方式多种多样，网上也有各种炫酷效果的具体实现方式，那么今天我主要是想来说说Google在Android5.0之后推出的NavigationView的具体使用方式。","156",3,30,new Date(),"OK，看完了图，接下来我们就来说说这个NavigationView吧。\n" +
                "1.NavigationView是什么\n" +
                "\n" +
                "long long ago，我们做抽屉菜单的时候，左边滑出来的那一部分的布局都是由我们自己来定义的，自己写的话，花点时间也能做出来好看的侧拉菜单，但总是要耗费时间，于是Google在5.0之后推出了NavitationView，就是我们左边滑出来的那个菜单。这个菜单整体上分为两部分，上面一部分叫做HeaderLayout，下面的那些点击项都是menu，这样的效果如果我们要自己写肯定也能写出来，但是没有必要，既然Google提供了这个控件，那我们就来看看这个控件要怎么用吧。\n" +
                "2.NavigationView怎么用\n" +
                "\n" +
                "和普通的侧拉菜单制作方式一样，首先所有的东西还是都放在一个DrawerLayout中（如果你对DrawerLayout的使用还不熟悉，请参考这篇文章使用DrawerLayout实现侧拉菜单），只不过这次我们把左边滑出菜单的布局用一个NavigationView来代替，代码如下：\n" +
                "\n" +
                "[java] view plain copy\n" +
                "print?\n" +
                "\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "    <android.support.v4.widget.DrawerLayout  \n" +
                "        xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
                "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"  \n" +
                "        xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
                "        android:layout_width=\"match_parent\"  \n" +
                "        android:layout_height=\"match_parent\"  \n" +
                "        tools:context=\"org.mobiletrain.drawerlayout.MainActivity\">  \n" +
                "      \n" +
                "        <LinearLayout  \n" +
                "            android:layout_width=\"match_parent\"  \n" +
                "            android:layout_height=\"match_parent\"  \n" +
                "            android:orientation=\"vertical\">  \n" +
                "      \n" +
                "            <TextView  \n" +
                "                android:layout_width=\"wrap_content\"  \n" +
                "                android:layout_height=\"wrap_content\"  \n" +
                "                android:text=\"主页面\"/>  \n" +
                "        </LinearLayout>  \n" +
                "      \n" +
                "        <android.support.design.widget.NavigationView  \n" +
                "            android:id=\"@+id/navigation_view\"  \n" +
                "            android:layout_width=\"wrap_content\"  \n" +
                "            android:layout_height=\"match_parent\"  \n" +
                "            android:layout_gravity=\"left\"  \n" +
                "            android:fitsSystemWindows=\"true\"  \n" +
                "            app:headerLayout=\"@layout/header_layout\"  \n" +
                "            app:menu=\"@menu/main\"></android.support.design.widget.NavigationView>  \n" +
                "    </android.support.v4.widget.DrawerLayout>  \n" +
                "\n" +
                "OK，下面我来分别解释一下这里边几个属性的含义：\n" +
                "\n" +
                "1.android:layout_gravity=\"left\"属性表示该View是左边的滑出菜单，这个属性的含义不用多说，这是DrawerLayout使用方式中的知识点。\n" +
                "\n" +
                "2.app:headerLayout=\"@layout/header_layout\"表示引用一个头布局文件，这个头就是我们在上面看到的那个背景图片，包括背景图片上面的显示用户名的控件等等。\n" +
                "\n" +
                "3.app:menu=\"@menu/main\"表示引用一个menu作为下面的点击项\n" +
                "\n" +
                "OK，那我们再来看看头布局文件：\n" +
                "\n" +
                "[java] view plain copy\n" +
                "print?\n" +
                "\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "    <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
                "                  android:layout_width=\"match_parent\"  \n" +
                "                  android:layout_height=\"200dp\"  \n" +
                "                  android:orientation=\"vertical\">  \n" +
                "      \n" +
                "        <ImageView  \n" +
                "            android:id=\"@+id/iv\"  \n" +
                "            android:layout_width=\"match_parent\"  \n" +
                "            android:layout_height=\"match_parent\"  \n" +
                "            android:scaleType=\"centerCrop\"  \n" +
                "            android:src=\"@drawable/p1\"/>  \n" +
                "    </LinearLayout>  \n" +
                "\n" +
                "\n" +
                "再来看看menu文件：\n" +
                "\n" +
                "[java] view plain copy\n" +
                "print?\n" +
                "\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "    <menu xmlns:android=\"http://schemas.android.com/apk/res/android\">  \n" +
                "        <item  \n" +
                "            android:id=\"@+id/favorite\"  \n" +
                "            android:icon=\"@mipmap/ic_launcher\"  \n" +
                "            android:title=\"收藏\"/>  \n" +
                "        <item  \n" +
                "            android:id=\"@+id/wallet\"  \n" +
                "            android:icon=\"@mipmap/ic_launcher\"  \n" +
                "            android:title=\"钱包\"/>  \n" +
                "        <item  \n" +
                "            android:id=\"@+id/photo\"  \n" +
                "            android:icon=\"@mipmap/ic_launcher\"  \n" +
                "            android:title=\"相册\"/>  \n" +
                "        <item  \n" +
                "            android:id=\"@+id/file\"  \n" +
                "            android:icon=\"@mipmap/ic_launcher\"  \n" +
                "            android:title=\"文件\"/>  \n" +
                "    </menu>  ");
        Article article8=new Article("如何利用TensorFlow来训练聊天机器人","训练聊天机器人。",
                "实际工程中很少有直接用深度学习实现端对端的聊天机器人，但这里我们来看看怎么用深度学习的seq2seq模型来实现一个简易的聊天机器人。这篇文章将尝试使用TensorFlow来训练一个基于seq2seq的聊天机器人，实现根据语料库的训练让机器人回答问题。"
                ,"330",6,7,new Date(),"seq2seq\n" +
                "\n" +
                "关于seq2seq的机制原理可看之前的文章《深度学习的seq2seq模型》。\n" +
                "\n" +
                "循环神经网络\n" +
                "\n" +
                "在seq2seq模型中会使用到循环神经网络，目前流行的几种循环神经网络包括RNN、LSTM和GRU。这三种循环神经网络的机制原理可看之前的文章《循环神经网络》 《LSTM神经网络》 《GRU神经网络》。\n" +
                "\n" +
                "训练样本集\n" +
                "\n" +
                "主要是一些QA对，开放数据也很多可以下载，这里只是随便选用一小部分问题和回答，存放的格式是第一行为问题，第二行为回答，第三行又是问题，第四行为回答，以此类推。\n" +
                "\n" +
                "数据预处理\n" +
                "\n" +
                "要训练就肯定要将数据转成数字，可以用0到n的值来表示整个词汇，每个值表示一个单词，这里用VOCAB_SIZE来定义。还有问题的最大最小长度，回答的最大最小长度。除此之外还要定义UNK、GO、EOS和PAD符号，分别表示未知单词，比如你超过 VOCAB_SIZE范围的则认为未知单词，GO表示decoder开始的符号，EOS表示回答结束的符号，而PAD用于填充，因为所有QA对放到同个seq2seq模型中输入和输出都必须是相同的，于是就需要将较短长度的问题或回答用PAD进行填充。\n" +
                "\n" +
                "limit = {\n" +
                "    'maxq': 10,\n" +
                "    'minq': 0,\n" +
                "    'maxa': 8,\n" +
                "    'mina': 3\n" +
                "}\n" +
                "\n" +
                "UNK = 'unk'\n" +
                "GO = '<go>'\n" +
                "EOS = '<eos>'\n" +
                "PAD = '<pad>'\n" +
                "VOCAB_SIZE = 1000\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10\n" +
                "11\n" +
                "12\n" +
                "按照QA长度的限制进行筛选。\n" +
                "\n" +
                "def filter_data(sequences):\n" +
                "    filtered_q, filtered_a = [], []\n" +
                "    raw_data_len = len(sequences) // 2\n" +
                "\n" +
                "    for i in range(0, len(sequences), 2):\n" +
                "        qlen, alen = len(sequences[i].split(' ')), len(sequences[i + 1].split(' '))\n" +
                "        if qlen >= limit['minq'] and qlen <= limit['maxq']:\n" +
                "            if alen >= limit['mina'] and alen <= limit['maxa']:\n" +
                "                filtered_q.append(sequences[i])\n" +
                "                filtered_a.append(sequences[i + 1])\n" +
                "    filt_data_len = len(filtered_q)\n" +
                "    filtered = int((raw_data_len - filt_data_len) * 100 / raw_data_len)\n" +
                "    print(str(filtered) + '% filtered from original data')\n" +
                "\n" +
                "    return filtered_q, filtered_a\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10\n" +
                "11\n" +
                "12\n" +
                "13\n" +
                "14\n" +
                "15\n" +
                "我们还要得到整个语料库所有单词的频率统计，还要根据频率大小统计出排名前n个频率的单词作为整个词汇，也就是前面对应的VOCAB_SIZE。另外我们还需要根据索引值得到单词的索引，还有根据单词得到对应索引值的索引。\n" +
                "\n" +
                "def index_(tokenized_sentences, vocab_size):\n" +
                "    freq_dist = nltk.FreqDist(itertools.chain(*tokenized_sentences))\n" +
                "    vocab = freq_dist.most_common(vocab_size)\n" +
                "    index2word = [GO] + [EOS] + [UNK] + [PAD] + [x[0] for x in vocab]\n" +
                "    word2index = dict([(w, i) for i, w in enumerate(index2word)])\n" +
                "    return index2word, word2index, freq_dist\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "前面也说到在我们的seq2seq模型中，对于encoder来说，问题的长短是不同的，那么不够长的要用PAD进行填充，比如问题为”how are you”，假如长度定为10，则需要将其填充为”how are you pad pad pad pad pad pad pad”。对于decoder来说，要以GO开始，以EOS结尾，不够长还得填充，比如”fine thank you”，则要处理成”go fine thank you eos pad pad pad pad pad “。第三个要处理的则是我们的target，target其实和decoder的输入是相同的，只不过它刚好有一个位置的偏移，比如上面要去掉go，变成”fine thank you eos pad pad pad pad pad pad”");
        Article article9=new Article("分布式系统调用链监控","分布式系统调用链监控",
                "应用架构由集中式向分布式演进后，整个调用关系变得复杂。\n" +
                        "分布式架构由复杂且较大规模集群构成，各个应用之间相当独立，可能由不同团队、不同语言实现。\n"
                ,"160",6,3,new Date(),"一个请求完整的调用链可能如下图，经过多个系统服务，调用关系复杂。\n" +
                "\n" +
                "这里写图片描述\n" +
                "\n" +
                "期间我们会关注各个调用的各项性能指标，比如吞吐量（TPS）、响应时间及错误记录等。\n" +
                "\n" +
                "吞吐量，根据拓扑可相应计算组件、平台、物理设备的实时吞吐量。\n" +
                "响应时间，包括整体调用的响应时间和各个服务的响应时间等。\n" +
                "错误记录，根据服务返回统计单位时间异常次数。\n" +
                "全链路性能监控从整体维度到局部维度展示各项指标，将跨应用的所有调用链性能信息集中展现，可方便度量整体和局部性能，并且方便找到故障产生的源头，生产上可极大缩短故障排除时间。\n" +
                "\n" +
                "Google Dapper\n" +
                "\n" +
                "系统整个调用链 \n" +
                "1. 当用户发起一个请求时，首先到达前端A服务，然后分别对B服务和C服务进行RPC调用； \n" +
                "2. B服务处理完给A做出响应，但是C服务还需要和后端的D服务和E服务交互之后再返还给A服务，最后由A服务来响应用户的请求； \n" +
                "这里写图片描述\n" +
                "\n" +
                "对整个调用过程的追踪 \n" +
                "1. 请求到来生成一个全局TraceID，通过TraceID可以串联起整个调用链，一个TraceID代表一次请求。 \n" +
                "2. 除了TraceID外，还需要SpanID用于记录调用父子关系。每个服务会记录下parent id和span id，通过他们可以组织一次完整调用链的父子关系。 \n" +
                "3. 一个没有parent id的span成为root span，可以看成调用链入口。 \n" +
                "4. 所有这些ID可用全局唯一的64位整数表示； \n" +
                "5. 整个调用过程中每个请求都要透传TraceID和SpanID。 \n" +
                "6. 每个服务将该次请求附带的TraceID和附带的SpanID作为parent id记录下，并且将自己生成的SpanID也记录下。 \n" +
                "7. 要查看某次完整的调用则只要根据TraceID查出所有调用记录，然后通过parent id和span id组织起整个调用父子关系。");
        Article article10=new Article(" Java Develop——基于 Redis 的分布式锁 ","Java Develop——基于 Redis 的分布式锁 ",
                "分布式锁应用场景都是用在高并发，大流量场景。."
                ,"160",6,4,new Date(),"1.用Apache ab压测模拟并发\n" +
                "\n" +
                "ab 的使用非常简单：\n" +
                "\n" +
                "//-n模拟100个请求，-c模拟100个并发\n" +
                "ab -n 100 -c 100 http://www.example.com/\n" +
                "\n" +
                "//-t模拟60秒，-c模拟100个并发，它会在连续60秒内不停的发请求\n" +
                "ab -t 60 -c 100 http://www.example.com/\n" +
                "\n" +
                "例如常见的秒杀系统，秒杀数据放在 MySQL 这类数据库中时，通过 select…for update 手工加锁可以避免超卖现象。但是为了提升查询速度，常将这些数据放在内存、Redis 中，压测后会发现出现了超卖的现象针对这个现象，可以通过 synchronized 关键字加锁处理并发：\n" +
                "\n" +
                "/**\n" +
                " * 秒杀的方法\n" +
                " */\n" +
                "public synchronized void orderProductMockDiffUser(String productId) {\n" +
                "}\n" +
                "\n" +
                "    1\n" +
                "    2\n" +
                "    3\n" +
                "    4\n" +
                "    5\n" +
                "\n" +
                "这样处理后，再次压测，会发现时间变成了，这是因为加锁处理后，每次访问方法的线程只会有一个线程。这种方法是一种解决方法，但是无法做到细粒度的控制。上面是秒杀的同一个商品的场景，假如说现在有很多商品，每个商品 id 不一样，但是它们都会访问同一个秒杀方法，这会造成一个现象，假如秒杀商品 A 的人非常多，秒杀商品 B 的人非常少，但是两个都会非常慢，因为它们每次访问方法的线程只会有一个线程，无法做到细粒度的控制。还有重要的一点是，这种方法只适合单点的情况，如果水平扩展后 (集群)，不同的用户看到的是五花八门的。基于这个问题，就引出了基于 Redis 的分布式锁。\n" +
                "2.基于 Redis 的分布式锁\n" +
                "\n" +
                "首先看两个 Redis 的命令：\n" +
                "\n" +
                "SETNX key value\n" +
                "将key设置值为value，如果key不存在，这种情况下等同SET命令。 当key存在时，什么也不做。SETNX是”SET if Not eXists”的简写。\n" +
                "参考: http://www.redis.cn/commands/setnx.html\n" +
                "\n" +
                "GETSET key value\n" +
                "自动将key对应到value并且返回原来key对应的value。如果key存在但是对应的value不是字符串，就返回错误。\n" +
                "参考: http://www.redis.cn/commands/getset.html\n" +
                "\n" +
                "基于 Redis 的分布式锁其实就是在秒杀的方法前后进行加锁、解锁操作：\n" +
                "\n" +
                "/**\n" +
                " * 秒杀的方法\n" +
                " */\n" +
                "public void orderProductMockDiffUser(String productId) {\n" +
                "    //加锁\n" +
                "    //...\n" +
                "    //解锁\n" +
                "}\n" +
                "\n" +
                "    1\n" +
                "    2\n" +
                "    3\n" +
                "    4\n" +
                "    5\n" +
                "    6\n" +
                "    7\n" +
                "    8\n" +
                "\n" +
                "下面新建一个 Redis 分布式锁的处理，把加锁和解锁写进来：\n" +
                "\n" +
                "@Component\n" +
                "@Slf4j\n" +
                "public class RedisLock {\n" +
                "    private Logger logger = LoggerFactory.getLogger(getClass());\n" +
                "    @Autowired\n" +
                "    private StringRedisTemplate redisTemplate;\n" +
                "\n" +
                "    /**\n" +
                "     * 加锁\n" +
                "     *\n" +
                "     * @param key\n" +
                "     * @param value 当前时间+超时时间\n" +
                "     * @return\n" +
                "     */\n" +
                "    public boolean lock(String key, String value) {\n" +
                "        //SETNX命令, 可以设置返回true, 不可以返回false\n" +
                "        if (redisTemplate.opsForValue().setIfAbsent(key, value)) {\n" +
                "            return true;\n" +
                "        }\n" +
                "        String currentValue = redisTemplate.opsForValue().get(key);\n" +
                "        //如果锁过期\n" +
                "        if (StringUtils.isEmpty(currentValue)\n" +
                "                && (Long.parseLong(currentValue) < System.currentTimeMillis())) {\n" +
                "            //GETSET命令, 获取上一个锁的时间\n" +
                "            String oldValue = redisTemplate.opsForValue().getAndSet(key, value);\n" +
                "            if (!StringUtils.isEmpty(oldValue) && oldValue.equals(value)) {\n" +
                "                return true;\n" +
                "            }\n" +
                "        }\n" +
                "        return false;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 解锁\n" +
                "     */\n" +
                "    public void unLock(String key, String value) {\n" +
                "        try {\n" +
                "            String currentValue = redisTemplate.opsForValue().get(key);\n" +
                "            if (!StringUtils.isEmpty(currentValue)\n" +
                "                    && currentValue.equals(value)) {\n" +
                "                redisTemplate.opsForValue().getOperations().delete(key);\n" +
                "            }\n" +
                "        } catch (Exception e) {\n" +
                "            logger.error(\"【redis分布式锁】解锁异常, {}\", e);\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "    47\n" +
                "\n" +
                "使用就很简单了：\n" +
                "\n" +
                "private static final int TIMEOUT = 10 * 1000; //超时时间10秒\n" +
                "@Autowired\n" +
                "private RedisLock redisLock;\n" +
                "/**\n" +
                " * 秒杀的方法\n" +
                " */\n" +
                "public void orderProductMockDiffUser(String productId) {\n" +
                "    //加锁\n" +
                "    long time = System.currentTimeMillis() + TIMEOUT;\n" +
                "    if(!redisLock.lock(productId, String.valueOf(time))) {\n" +
                "        throw new SellException(101, \"人也太多了, 换个姿势再试试～\");\n" +
                "    };\n" +
                "    //...\n" +
                "    //解锁\n" +
                "    redisLock.unLock(productId, String.valueOf(time));\n" +
                "}\n" +
                "\n" +
                "\n" +
                "到此就完成了分布式锁的处理。");
        articleService.insertArticle(article1);
        articleService.insertArticle(article2);
        articleService.insertArticle(article3);
        articleService.insertArticle(article4);
        articleService.insertArticle(article5);
        articleService.insertArticle(article6);
        articleService.insertArticle(article7);
        articleService.insertArticle(article8);
        articleService.insertArticle(article9);
        articleService.insertArticle(article10);
    }

    @Test
    public void findAllArticles(){
        List<Article> articles=articleService.findAllArticles();
        System.out.println(articles.size());
    }


    @Test
    public void listArticlesPage(){
        List<Article> articles=articleService.listArticlesByPage(2);
        for (Article article:articles){
            System.out.println(ReflectionToStringBuilder.toString(article, ToStringStyle.MULTI_LINE_STYLE));
        }
    }

    @Test
    public void testfindArticleById(){
        Article article=articleService.findArticleById(1);
        System.out.println(ReflectionToStringBuilder.toString(article,ToStringStyle.MULTI_LINE_STYLE));
    }
}
