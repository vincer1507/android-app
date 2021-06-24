package com.example.fyp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MaterialArticleDetailActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_article_detail);

        Intent intent = getIntent();
        String articleName = intent.getStringExtra("An");
        TextView article = findViewById(R.id.label);

        switch (articleName) {
            case "認識精神病-有關精神病的謬誤與事實":
                article.setText("一個人如出現強烈的情緒波動就可能是患上精神病？\n" +
                        "一般人在面對一些困難的處境時（例如：親友離世、考試在即、適應新\n" +
                        "環境）出現暴躁、反叛、易哭或情緒波動等，屬常見的壓力反應。大部\n" +
                        "分人在危機過去後，情況都會穩定下來。但如這些情況持續，並影響到\n" +
                        "日常生活，如工作、學習、社交及自我照顧能力等，則有需要尋求輔導\n" +
                        "或其他相關專業的意見。\n" +
                        "• 精神病是無法預防的？\n" +
                        "部分精神病 (如抑鬱症或焦慮症) 可透過健康的生活方式及運用有效的情\n" +
                        "緒管理方法減低發病風險。但精神病的成因複雜，暫時仍未有方法可完\n" +
                        "全預防。然而，一般精神病患者在病發前會出現先兆或徵狀，例如情緒\n" +
                        "持續低落、胃口欠佳、長期失眠、疏於自理、作輕率或不設實際的決定\n" +
                        "等。如能及早察覺病發的早期症狀並適當地介入，便可避免病情惡化，\n" +
                        "減少患病對生活的影響和增加康復的機會。\n" +
                        "• 精神病永不會康復？\n" +
                        "大部分患者如能及早察覺病發的早期徵狀並適時接受藥物及心理治療，\n" +
                        "一般都能穩定病情，逐漸康復及恢復正常的生活。但康復過程因人而\n" +
                        "異，有些症狀可以在短時間內完全消失，有些症狀則可能持續一段時\n" +
                        "間，甚至出現重覆病發的現象，以致治療及康復期較長。在適當的治療\n" +
                        "下，大部分精神病患者的症狀會逐漸減退，所需要的支援在不同階段也\n" +
                        "會有所不同。\n" +
                        "• 一般人無法協助精神病患者康復？\n" +
                        "精神病患者需要醫護專業人員的治療以得到康復。但在治療及康復期\n" +
                        "間，除了患者個人的努力外，身邊人（如家人、教師及朋友等）的關\n" +
                        "懷、支持、體諒和接納，亦有助促進康復的進程。由於精神病的種類繁\n" +
                        "多，其病徵及治療方法不一，對患者日常生活的影響也有所不同，我們\n" +
                        "需增加對精神病的了解及認識，以更有效支援及接納受精神病患影響的\n" +
                        "人士。");
                break;
            case "精神病的成因":
                article.setText("精神病是疾病的一種，其成因涉及不同層面，包括生理、心理和社會因素等。生\n" +
                        "理因素包括遺傳、長期病患、腦部感染或受創，酒精或藥物影響，甲狀腺分泌失\n" +
                        "調等。心理因素包括個性敏感、看待自己和周遭世界的方式有偏差、解難能力較\n" +
                        "弱等。社會因素包括家庭不和、管教不當、朋輩欺凌、自我要求過高等。每個精\n" +
                        "神病的患者的危險因素和保護因素 不盡相同，因此，在制定每位患者的治療計劃\n" +
                        "和支援策略時，需要考慮以上不同的因素。在個案分享的章節將會闡述各種因素\n" +
                        "如何影響不同患者。");
                break;
            case "甚麼是抑鬱症？":
                article.setText("抑鬱症是一種精神病，其核心的症狀是長期且持續地情緒低落、悶悶不樂或煩\n" +
                        "躁，並對大部分事情失去興趣或動力，而影響日常生活，如學業、人際關係或\n" +
                        "社交活動。較常見的抑鬱症症狀可見下表。部分較嚴重的患者會出現如妄想、\n" +
                        "幻覺等症狀。\n" +
                        "\n" +
                        "認知、行為和情緒是息息相關的，而患有抑鬱症的人在認知、行為及情緒上都較為負\n" +
                        "面，在這三方面的相互影響下，有機會形成一個惡性循環，令負面情緒持續。\n" +
                        "患者大部分時間會感到情緒低落，對於生活上的大小事情，他們較難保持客觀的看法。\n" +
                        "他們較易察覺、留意及記住不如意的事情，甚至只是事情的細節。他們未必能感受到其\n" +
                        "他人對自己的關心及重視，亦傾向忽視別人對自己的肯定或讚賞。久而久之，患者有機\n" +
                        "會產生慣性的負面看法，例如：「沒有人喜歡我」、「我不能夠做得好」等，而長期低\n" +
                        "落的情緒也會影響患者的飲食、睡眠和健康。");

                break;
            case"抑鬱症的成因":
                article.setText("抑鬱症的成因複雜，大部分抑鬱症都是由於生理、心理及環境三者的因素相互影響而成的。\n" +
                        "(1) 生理因素\n" +
                        "• 腦部變化：抑鬱症與腦部結構或運作異常有關。研究指出，兩種腦部傳遞訊\n" +
                        "息的化學物質─血清素和去甲腎上腺素與情緒的調控有莫大關係。當這些化\n" +
                        "學物質失衡，有可能導致抑鬱症。\n" +
                        "• 家族遺傳：抑鬱症在一些家庭中有遺傳的情況。研究發現抑鬱症患者的近親\n" +
                        "患此症的可能性相對較高，家族中愈多成員患有抑鬱症，其發病風險較高，\n" +
                        "發病年齡也愈早。若父母其中一人曾患嚴重抑鬱症，子女患上抑鬱症的風險\n" +
                        "會較一般人高八倍。然而，抑鬱症亦可出現於沒有相關家族史的人身上。\n" +
                        "• 身體疾病：一些疾病（如心臟病、癌症、荷爾蒙失調、甲狀腺分泌過低和紅\n" +
                        "斑狼瘡症等）和長期痛症（如關節炎等）可引發抑鬱症。此外，長期吸收由\n" +
                        "化學物質（如藥物和酒精）造成的毒性，亦有可能誘發抑鬱症的出現。\n" +
                        "(2) 心理因素\n" +
                        "• 性格因素：性格上較容易緊張、固執、對別人的批評較為敏感、自信心較\n" +
                        "低、較悲觀及無法應付壓力的人，會較易患上抑鬱症。\n" +
                        "• 思想模式：傾向留意自身的負面情緒或習慣用負面角度思考的人，會較易患\n" +
                        "上抑鬱症。\n" +
                        "(3) 環境因素\n" +
                        "• 創傷及壓力：成長過程曾承受傷痛經歷（例如遭受虐待），會增加抑鬱症的\n" +
                        "發病風險。此外，失去摯愛、人際關係出現問題、財政困難、以至其他生活\n" +
                        "上的轉變，都可能構成壓力，引發抑鬱症。\n" +
                        "• 社交支援：缺乏親友支援，經常獨處的人士較容易出現抑鬱。\n" +
                        "Source: Education Bureau (2017) 認識及幫助有精神病患的生 教師資源手冊Retrieved from https://www.edb.gov.hk/attachment/tc/student-parents/crisis-management/about-crisis-management/Resource_Handbook_on_MI_Chi.pdf\n" +
                        "");
                break;
            default:
                article.setText("精神健康狀況是指你的心理狀態，包括感覺和應付日常生活問題的能力。我們的精神狀況會隨年月時間改變。如果擁有良好的精神健康，你能夠：\n" +
                        "對自己感到一定自信，並能夠根據實際和合理的標準來接受和評價自己\n" +
                        "感受和表達不同情緒\n" +
                        "投入現實世界，與其他人建立和維持良好關係，而且感受到自己能為社會做出貢獻\n" +
                        "有效工作和生活\n" +
                        "能應對日常生活中的壓力，和妥善處理未知因素和轉變\n" +
                        "\n" +
                        "有什麼會影響我的精神健康狀況？\n" +
                        "每個人都經歷過精神健康狀況的低潮，包括情緒低落、焦慮和不知所措。例如，當我們經歷失落、孤獨或感情問題 ，抑或在工作和金錢方面遇上困難。有時候甚至未必有明確的原因。\n" +
                        "但是，有些因素會令你的精神健康狀況容易變差，例如，如果你曾經歷：\n" +
                        "\n" +
                        "童年期間的虐待，精神性創傷，暴力對待或忽視、社交上被孤立或歧視\n" +
                        "、長期病患、欠債和不利的社會條件、為朋友或家人擔憂。\n" +
                        "成年後經歷精神創傷，例如遭遇嚴重意外，或成為暴力事件中的受害者\n" +
                        "假如你曾經長時間精神健康狀況欠佳，你會有更大機會遇上精神健康問題。如果你已經有精神健康問題，例如抑鬱症或焦慮症，你會比其他人更容易經歷精神健康的低潮。儘管如此，你仍然會有感覺比較好的時候，能順利處理日常生活。\n" +
                        "\n" +
                        "我能做什麼來維持良好精神健康？\n" +
                        "無論你是否有精神健康問題，你也可能在人生中遇上困難。「心理韌性」就是指在困境中保持良好精神健康的能力。這部分會給予一些建立和增強心理韌性的建議，助你順利處理日常生活和渡過困境。\n" +
                        "\n" +
                        "跟別人分享感受\n" +
                        "遇到困難的時候，不妨跟信任的人表達你的感受。家人和朋友不時能給予有用的意見和幫助 ，亦能助你從其他角度分析問題的成因。就算他們無法提供實際協助，但在傾談的過程中，別人的聆聽和理解對你而言，亦是一大助力。\n" +
                        "\n" +
                        "與別人保持健康的關係\n" +
                        "要保持良好的精神健康，建立及維繫有益的人際關係是十分重要的。跟正面和支持你的人在一起，有助建立良好的自我形象、增強自信和抗逆能力。如果你能夠主動支持和關心身邊的人，會更容易得到他們的正面回應，提升自我形象和相信自己有能力為這個社會作出貢獻。相反，如果你缺乏應有的社交聯繫，或因任何原因感到孤獨，都會對精神健康構成不良影響。\n");
                break;
        }
    }
}