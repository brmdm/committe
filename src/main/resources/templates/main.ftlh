<#import "parts/common.ftlh" as c>
<#import "parts/pager.ftlh" as p>
<#import "/spring.ftl" as spring>
<#include "parts/security.ftlh">
<@c.page>
    <h5><@spring.message "main.hello"/>, ${name}</h5>
    <@p.pager url page />
        <div class="card-columns">
            <#list page.content  as faculty>
                <div class="card my-3" style="width: 18rem;">
                    <h5 class="card-title">  ${faculty.title}.</h5>
                    <b>Places: ${faculty.allPlaces}. </b>
                    <b>Budget PLaces: ${faculty.budgetPlaces}. </b>
                    <div class="m-2">
                        <i><@spring.message "main.freeseats"/> : </i>
                    </div>
                    <div class="card-footer text-muted">
                        <@spring.message "main.price"/> = ${faculty.id}. <a href="/ticket/${faculty.id}"><@spring.message "main.buyticket"/></a>
                    </div>

                </div>
            </#list>
        </div>
    <@p.pager url page />

</@c.page>